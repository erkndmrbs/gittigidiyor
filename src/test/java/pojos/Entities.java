package pojos;

import java.util.HashMap;
import java.util.Map;

public class Entities {

    private Card__1 card;
    private Date date;
    private MemberCreator memberCreator;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public Entities() {
    }

    /**
     *
     * @param date
     * @param memberCreator
     * @param card
     */
    public Entities(Card__1 card, Date date, MemberCreator memberCreator) {
        super();
        this.card = card;
        this.date = date;
        this.memberCreator = memberCreator;
    }

    public Card__1 getCard() {
        return card;
    }

    public void setCard(Card__1 card) {
        this.card = card;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public MemberCreator getMemberCreator() {
        return memberCreator;
    }

    public void setMemberCreator(MemberCreator memberCreator) {
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
        sb.append(Entities.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("card");
        sb.append('=');
        sb.append(((this.card == null)?"<null>":this.card));
        sb.append(',');
        sb.append("date");
        sb.append('=');
        sb.append(((this.date == null)?"<null>":this.date));
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
