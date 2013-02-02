package egeo.ui;

import oauth.signpost.exception.OAuthException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.browser.LocationEvent;
import org.eclipse.swt.browser.LocationListener;
import org.eclipse.swt.browser.ProgressEvent;
import org.eclipse.swt.browser.ProgressListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

import egeo.live.Auth;

public class TokenRequestDialog extends Dialog {

	private final Auth auth;
	private Label label;

	/**
	 * Create the dialog.
	 * 
	 * @param parentShell
	 */
	public TokenRequestDialog(Shell parentShell) {
		super(parentShell);

		this.auth = new Auth();

	}

	@Override
	protected boolean isResizable() {
		return true;
	}

	private void setStatusMsg(final String msg) {
		getShell().getDisplay().asyncExec(new Runnable() {
			@Override
			public void run() {
				label.setText(msg);
			}
		});
	}

	/**
	 * Create contents of the dialog.
	 * 
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);

		final Browser browser = new Browser(container, SWT.BORDER);

		browser.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		browser.setJavascriptEnabled(true);
		browser.addLocationListener(new LocationListener() {

			@Override
			public void changing(LocationEvent event) {
				System.out.println("Changing: " + event.location);
			}

			@Override
			public void changed(LocationEvent event) {
				System.out.println("Changed: " + event.location);
			}
		});

		label = new Label(container, SWT.NONE);
		label.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1,
				1));
		label.setText("");

		final Display display = Display.getCurrent();
		Job job = new Job("Fetching request token") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				final String authUrl;
				try {
					setStatusMsg("Fetching request token...");
					authUrl = auth
							.retrieveRequestToken("http://localhost:12345/");
				} catch (OAuthException e) {
					e.printStackTrace();
					return Status.OK_STATUS;
				}

				display.asyncExec(new Runnable() {
					@Override
					public void run() {
						setStatusMsg("Loading login page");
						browser.setUrl(authUrl);
					}
				});

				return Status.OK_STATUS;
			}
		};

		job.setUser(true);
		job.schedule();

		browser.addProgressListener(new ProgressListener() {
			boolean completed = false;

			@Override
			public void completed(ProgressEvent event) {
				if (!completed) {
					setStatusMsg("Completed.");
					completed = true;
				}
			}

			@Override
			public void changed(ProgressEvent event) {
				if (!completed)
					setStatusMsg("Loading page...");
			}
		});

		return container;
	}

	/**
	 * Create contents of the button bar.
	 * 
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL,
				true);
		createButton(parent, IDialogConstants.CANCEL_ID,
				IDialogConstants.CANCEL_LABEL, false);
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(765, 645);
	}

}
