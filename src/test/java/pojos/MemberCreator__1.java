package pojos;

import java.util.HashMap;
import java.util.Map;

public class MemberCreator__1 {

    private String id;
    private Boolean activityBlocked;
    private String avatarHash;
    private String avatarUrl;
    private String fullName;
    private Object idMemberReferrer;
    private String initials;
    private NonPublic nonPublic;
    private Boolean nonPublicAvailable;
    private String username;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public MemberCreator__1() {
    }

    /**
     *
     * @param activityBlocked
     * @param avatarHash
     * @param avatarUrl
     * @param initials
     * @param nonPublicAvailable
     * @param idMemberReferrer
     * @param fullName
     * @param id
     * @param nonPublic
     * @param username
     */
    public MemberCreator__1(String id, Boolean activityBlocked, String avatarHash, String avatarUrl, String fullName, Object idMemberReferrer, String initials, NonPublic nonPublic, Boolean nonPublicAvailable, String username) {
        super();
        this.id = id;
        this.activityBlocked = activityBlocked;
        this.avatarHash = avatarHash;
        this.avatarUrl = avatarUrl;
        this.fullName = fullName;
        this.idMemberReferrer = idMemberReferrer;
        this.initials = initials;
        this.nonPublic = nonPublic;
        this.nonPublicAvailable = nonPublicAvailable;
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Boolean getActivityBlocked() {
        return activityBlocked;
    }

    public void setActivityBlocked(Boolean activityBlocked) {
        this.activityBlocked = activityBlocked;
    }

    public String getAvatarHash() {
        return avatarHash;
    }

    public void setAvatarHash(String avatarHash) {
        this.avatarHash = avatarHash;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Object getIdMemberReferrer() {
        return idMemberReferrer;
    }

    public void setIdMemberReferrer(Object idMemberReferrer) {
        this.idMemberReferrer = idMemberReferrer;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public NonPublic getNonPublic() {
        return nonPublic;
    }

    public void setNonPublic(NonPublic nonPublic) {
        this.nonPublic = nonPublic;
    }

    public Boolean getNonPublicAvailable() {
        return nonPublicAvailable;
    }

    public void setNonPublicAvailable(Boolean nonPublicAvailable) {
        this.nonPublicAvailable = nonPublicAvailable;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MemberCreator__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("activityBlocked");
        sb.append('=');
        sb.append(((this.activityBlocked == null)?"<null>":this.activityBlocked));
        sb.append(',');
        sb.append("avatarHash");
        sb.append('=');
        sb.append(((this.avatarHash == null)?"<null>":this.avatarHash));
        sb.append(',');
        sb.append("avatarUrl");
        sb.append('=');
        sb.append(((this.avatarUrl == null)?"<null>":this.avatarUrl));
        sb.append(',');
        sb.append("fullName");
        sb.append('=');
        sb.append(((this.fullName == null)?"<null>":this.fullName));
        sb.append(',');
        sb.append("idMemberReferrer");
        sb.append('=');
        sb.append(((this.idMemberReferrer == null)?"<null>":this.idMemberReferrer));
        sb.append(',');
        sb.append("initials");
        sb.append('=');
        sb.append(((this.initials == null)?"<null>":this.initials));
        sb.append(',');
        sb.append("nonPublic");
        sb.append('=');
        sb.append(((this.nonPublic == null)?"<null>":this.nonPublic));
        sb.append(',');
        sb.append("nonPublicAvailable");
        sb.append('=');
        sb.append(((this.nonPublicAvailable == null)?"<null>":this.nonPublicAvailable));
        sb.append(',');
        sb.append("username");
        sb.append('=');
        sb.append(((this.username == null)?"<null>":this.username));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
