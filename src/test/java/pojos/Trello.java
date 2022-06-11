package pojos;

import java.util.HashMap;
import java.util.Map;

public class Trello {

    private String id;
    private String idMemberCreator;
    private Data data;
    private Object appCreator;
    private String type;
    private String date;
    private Object limits;
    private Display display;
    private MemberCreator__1 memberCreator;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Trello() {
    }

    /**
     *
     * @param date
     * @param data
     * @param appCreator
     * @param display
     * @param memberCreator
     * @param id
     * @param type
     * @param idMemberCreator
     * @param limits
     */
    public Trello(String id, String idMemberCreator, Data data, Object appCreator, String type, String date, Object limits, Display display, MemberCreator__1 memberCreator) {
        super();
        this.id = id;
        this.idMemberCreator = idMemberCreator;
        this.data = data;
        this.appCreator = appCreator;
        this.type = type;
        this.date = date;
        this.limits = limits;
        this.display = display;
        this.memberCreator = memberCreator;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdMemberCreator() {
        return idMemberCreator;
    }

    public void setIdMemberCreator(String idMemberCreator) {
        this.idMemberCreator = idMemberCreator;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Object getAppCreator() {
        return appCreator;
    }

    public void setAppCreator(Object appCreator) {
        this.appCreator = appCreator;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Object getLimits() {
        return limits;
    }

    public void setLimits(Object limits) {
        this.limits = limits;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public MemberCreator__1 getMemberCreator() {
        return memberCreator;
    }

    public void setMemberCreator(MemberCreator__1 memberCreator) {
        this.memberCreator = memberCreator;
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
        sb.append(Trello.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("idMemberCreator");
        sb.append('=');
        sb.append(((this.idMemberCreator == null)?"<null>":this.idMemberCreator));
        sb.append(',');
        sb.append("data");
        sb.append('=');
        sb.append(((this.data == null)?"<null>":this.data));
        sb.append(',');
        sb.append("appCreator");
        sb.append('=');
        sb.append(((this.appCreator == null)?"<null>":this.appCreator));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null)?"<null>":this.date));
        sb.append(',');
        sb.append("limits");
        sb.append('=');
        sb.append(((this.limits == null)?"<null>":this.limits));
        sb.append(',');
        sb.append("display");
        sb.append('=');
        sb.append(((this.display == null)?"<null>":this.display));
        sb.append(',');
        sb.append("memberCreator");
        sb.append('=');
        sb.append(((this.memberCreator == null)?"<null>":this.memberCreator));
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
