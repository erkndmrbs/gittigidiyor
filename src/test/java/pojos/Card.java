package pojos;

import java.util.HashMap;
import java.util.Map;

public class Card {

    private String shortLink;
    private Integer idShort;
    private String name;
    private String id;
    private String due;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Card() {
    }

    /**
     *
     * @param idShort
     * @param due
     * @param name
     * @param id
     * @param shortLink
     */
    public Card(String shortLink, Integer idShort, String name, String id, String due) {
        super();
        this.shortLink = shortLink;
        this.idShort = idShort;
        this.name = name;
        this.id = id;
        this.due = due;
    }

    public String getShortLink() {
        return shortLink;
    }

    public void setShortLink(String shortLink) {
        this.shortLink = shortLink;
    }

    public Integer getIdShort() {
        return idShort;
    }

    public void setIdShort(Integer idShort) {
        this.idShort = idShort;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDue() {
        return due;
    }

    public void setDue(String due) {
        this.due = due;
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
        sb.append(Card.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("shortLink");
        sb.append('=');
        sb.append(((this.shortLink == null)?"<null>":this.shortLink));
        sb.append(',');
        sb.append("idShort");
        sb.append('=');
        sb.append(((this.idShort == null)?"<null>":this.idShort));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("due");
        sb.append('=');
        sb.append(((this.due == null)?"<null>":this.due));
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
