package com.kaishengit.entitys;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Ticket implements Serializable {
    private Integer id;

    private Date outTime;

    private Date inTime;

    private String content;

    private String num;

    private Integer ticketofficeId;

    private Integer ticketInLogId;

    public static final Integer default_ticketOffice_id = 0;

    private Date overDataTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getOutTime() {
        return outTime;
    }

    public void setOutTime(Date outTime) {
        this.outTime = outTime;
    }

    public Date getInTime() {
        return inTime;
    }

    public void setInTime(Date inTime) {
        this.inTime = inTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public Integer getTicketofficeId() {
        return ticketofficeId;
    }

    public void setTicketofficeId(Integer ticketofficeId) {
        this.ticketofficeId = ticketofficeId;
    }

    public Integer getTicketInLogId() {
        return ticketInLogId;
    }

    public void setTicketInLogId(Integer ticketInLogId) {
        this.ticketInLogId = ticketInLogId;
    }

    public Date getOverDataTime() {
        return overDataTime;
    }

    public void setOverDataTime(Date overDataTime) {
        this.overDataTime = overDataTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Ticket other = (Ticket) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOutTime() == null ? other.getOutTime() == null : this.getOutTime().equals(other.getOutTime()))
            && (this.getInTime() == null ? other.getInTime() == null : this.getInTime().equals(other.getInTime()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getNum() == null ? other.getNum() == null : this.getNum().equals(other.getNum()))
            && (this.getTicketofficeId() == null ? other.getTicketofficeId() == null : this.getTicketofficeId().equals(other.getTicketofficeId()))
            && (this.getTicketInLogId() == null ? other.getTicketInLogId() == null : this.getTicketInLogId().equals(other.getTicketInLogId()))
            && (this.getOverDataTime() == null ? other.getOverDataTime() == null : this.getOverDataTime().equals(other.getOverDataTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOutTime() == null) ? 0 : getOutTime().hashCode());
        result = prime * result + ((getInTime() == null) ? 0 : getInTime().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getNum() == null) ? 0 : getNum().hashCode());
        result = prime * result + ((getTicketofficeId() == null) ? 0 : getTicketofficeId().hashCode());
        result = prime * result + ((getTicketInLogId() == null) ? 0 : getTicketInLogId().hashCode());
        result = prime * result + ((getOverDataTime() == null) ? 0 : getOverDataTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", outTime=").append(outTime);
        sb.append(", inTime=").append(inTime);
        sb.append(", content=").append(content);
        sb.append(", num=").append(num);
        sb.append(", ticketofficeId=").append(ticketofficeId);
        sb.append(", ticketInLogId=").append(ticketInLogId);
        sb.append(", overDataTime=").append(overDataTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}