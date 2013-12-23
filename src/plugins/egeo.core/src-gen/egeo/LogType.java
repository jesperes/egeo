/**
 */
package egeo;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Log Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see egeo.EgeoPackage#getLogType()
 * @model
 * @generated
 */
public enum LogType implements Enumerator
{
  /**
   * The '<em><b>Found It</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FOUND_IT_VALUE
   * @generated
   * @ordered
   */
  FOUND_IT(0, "FoundIt", "FoundIt"),

  /**
   * The '<em><b>Did Not Find</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DID_NOT_FIND_VALUE
   * @generated
   * @ordered
   */
  DID_NOT_FIND(0, "DidNotFind", "DidNotFind"),

  /**
   * The '<em><b>Write Note</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WRITE_NOTE_VALUE
   * @generated
   * @ordered
   */
  WRITE_NOTE(0, "WriteNote", "WriteNote"),

  /**
   * The '<em><b>Owner Maintenance</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OWNER_MAINTENANCE_VALUE
   * @generated
   * @ordered
   */
  OWNER_MAINTENANCE(0, "OwnerMaintenance", "OwnerMaintenance"),

  /**
   * The '<em><b>Will Attend</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WILL_ATTEND_VALUE
   * @generated
   * @ordered
   */
  WILL_ATTEND(0, "WillAttend", "WillAttend"),

  /**
   * The '<em><b>Attended</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ATTENDED_VALUE
   * @generated
   * @ordered
   */
  ATTENDED(0, "Attended", "Attended"),

  /**
   * The '<em><b>Announcement</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ANNOUNCEMENT_VALUE
   * @generated
   * @ordered
   */
  ANNOUNCEMENT(0, "Announcement", "Announcement"),

  /**
   * The '<em><b>Publish Listing</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PUBLISH_LISTING_VALUE
   * @generated
   * @ordered
   */
  PUBLISH_LISTING(0, "PublishListing", "PublishListing"),

  /**
   * The '<em><b>Enable Listing</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ENABLE_LISTING_VALUE
   * @generated
   * @ordered
   */
  ENABLE_LISTING(0, "EnableListing", "EnableListing"),

  /**
   * The '<em><b>Post Reviewer Note</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #POST_REVIEWER_NOTE_VALUE
   * @generated
   * @ordered
   */
  POST_REVIEWER_NOTE(0, "PostReviewerNote", "PostReviewerNote"),

  /**
   * The '<em><b>Update Coordinates</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UPDATE_COORDINATES_VALUE
   * @generated
   * @ordered
   */
  UPDATE_COORDINATES(0, "UpdateCoordinates", "UpdateCoordinates"),

  /**
   * The '<em><b>Disable</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DISABLE_VALUE
   * @generated
   * @ordered
   */
  DISABLE(0, "Disable", "Disable"),

  /**
   * The '<em><b>Needs Maintenance</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NEEDS_MAINTENANCE_VALUE
   * @generated
   * @ordered
   */
  NEEDS_MAINTENANCE(0, "NeedsMaintenance", "NeedsMaintenance"),

  /**
   * The '<em><b>Archive</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ARCHIVE_VALUE
   * @generated
   * @ordered
   */
  ARCHIVE(0, "Archive", "Archive"),

  /**
   * The '<em><b>Needs Archived</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NEEDS_ARCHIVED_VALUE
   * @generated
   * @ordered
   */
  NEEDS_ARCHIVED(0, "NeedsArchived", "NeedsArchived"),

  /**
   * The '<em><b>Unarchive</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UNARCHIVE_VALUE
   * @generated
   * @ordered
   */
  UNARCHIVE(0, "Unarchive", "Unarchive"),

  /**
   * The '<em><b>Retract Listing</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #RETRACT_LISTING_VALUE
   * @generated
   * @ordered
   */
  RETRACT_LISTING(0, "RetractListing", "RetractListing"),

  /**
   * The '<em><b>Webcam Photo Taken</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #WEBCAM_PHOTO_TAKEN_VALUE
   * @generated
   * @ordered
   */
  WEBCAM_PHOTO_TAKEN(0, "WebcamPhotoTaken", "WebcamPhotoTaken");

  /**
   * The '<em><b>Found It</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Found It</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FOUND_IT
   * @model name="FoundIt"
   * @generated
   * @ordered
   */
  public static final int FOUND_IT_VALUE = 0;

  /**
   * The '<em><b>Did Not Find</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Did Not Find</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DID_NOT_FIND
   * @model name="DidNotFind"
   * @generated
   * @ordered
   */
  public static final int DID_NOT_FIND_VALUE = 0;

  /**
   * The '<em><b>Write Note</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Write Note</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #WRITE_NOTE
   * @model name="WriteNote"
   * @generated
   * @ordered
   */
  public static final int WRITE_NOTE_VALUE = 0;

  /**
   * The '<em><b>Owner Maintenance</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Owner Maintenance</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #OWNER_MAINTENANCE
   * @model name="OwnerMaintenance"
   * @generated
   * @ordered
   */
  public static final int OWNER_MAINTENANCE_VALUE = 0;

  /**
   * The '<em><b>Will Attend</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Will Attend</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #WILL_ATTEND
   * @model name="WillAttend"
   * @generated
   * @ordered
   */
  public static final int WILL_ATTEND_VALUE = 0;

  /**
   * The '<em><b>Attended</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Attended</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ATTENDED
   * @model name="Attended"
   * @generated
   * @ordered
   */
  public static final int ATTENDED_VALUE = 0;

  /**
   * The '<em><b>Announcement</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Announcement</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ANNOUNCEMENT
   * @model name="Announcement"
   * @generated
   * @ordered
   */
  public static final int ANNOUNCEMENT_VALUE = 0;

  /**
   * The '<em><b>Publish Listing</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Publish Listing</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PUBLISH_LISTING
   * @model name="PublishListing"
   * @generated
   * @ordered
   */
  public static final int PUBLISH_LISTING_VALUE = 0;

  /**
   * The '<em><b>Enable Listing</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Enable Listing</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ENABLE_LISTING
   * @model name="EnableListing"
   * @generated
   * @ordered
   */
  public static final int ENABLE_LISTING_VALUE = 0;

  /**
   * The '<em><b>Post Reviewer Note</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Post Reviewer Note</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #POST_REVIEWER_NOTE
   * @model name="PostReviewerNote"
   * @generated
   * @ordered
   */
  public static final int POST_REVIEWER_NOTE_VALUE = 0;

  /**
   * The '<em><b>Update Coordinates</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Update Coordinates</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #UPDATE_COORDINATES
   * @model name="UpdateCoordinates"
   * @generated
   * @ordered
   */
  public static final int UPDATE_COORDINATES_VALUE = 0;

  /**
   * The '<em><b>Disable</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Disable</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DISABLE
   * @model name="Disable"
   * @generated
   * @ordered
   */
  public static final int DISABLE_VALUE = 0;

  /**
   * The '<em><b>Needs Maintenance</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Needs Maintenance</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NEEDS_MAINTENANCE
   * @model name="NeedsMaintenance"
   * @generated
   * @ordered
   */
  public static final int NEEDS_MAINTENANCE_VALUE = 0;

  /**
   * The '<em><b>Archive</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Archive</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ARCHIVE
   * @model name="Archive"
   * @generated
   * @ordered
   */
  public static final int ARCHIVE_VALUE = 0;

  /**
   * The '<em><b>Needs Archived</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Needs Archived</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NEEDS_ARCHIVED
   * @model name="NeedsArchived"
   * @generated
   * @ordered
   */
  public static final int NEEDS_ARCHIVED_VALUE = 0;

  /**
   * The '<em><b>Unarchive</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Unarchive</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #UNARCHIVE
   * @model name="Unarchive"
   * @generated
   * @ordered
   */
  public static final int UNARCHIVE_VALUE = 0;

  /**
   * The '<em><b>Retract Listing</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Retract Listing</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #RETRACT_LISTING
   * @model name="RetractListing"
   * @generated
   * @ordered
   */
  public static final int RETRACT_LISTING_VALUE = 0;

  /**
   * The '<em><b>Webcam Photo Taken</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Webcam Photo Taken</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #WEBCAM_PHOTO_TAKEN
   * @model name="WebcamPhotoTaken"
   * @generated
   * @ordered
   */
  public static final int WEBCAM_PHOTO_TAKEN_VALUE = 0;

  /**
   * An array of all the '<em><b>Log Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final LogType[] VALUES_ARRAY =
    new LogType[]
    {
      FOUND_IT,
      DID_NOT_FIND,
      WRITE_NOTE,
      OWNER_MAINTENANCE,
      WILL_ATTEND,
      ATTENDED,
      ANNOUNCEMENT,
      PUBLISH_LISTING,
      ENABLE_LISTING,
      POST_REVIEWER_NOTE,
      UPDATE_COORDINATES,
      DISABLE,
      NEEDS_MAINTENANCE,
      ARCHIVE,
      NEEDS_ARCHIVED,
      UNARCHIVE,
      RETRACT_LISTING,
      WEBCAM_PHOTO_TAKEN,
    };

  /**
   * A public read-only list of all the '<em><b>Log Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<LogType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Log Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LogType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      LogType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Log Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LogType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      LogType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Log Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LogType get(int value)
  {
    switch (value)
    {
      case FOUND_IT_VALUE: return FOUND_IT;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private LogType(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //LogType
