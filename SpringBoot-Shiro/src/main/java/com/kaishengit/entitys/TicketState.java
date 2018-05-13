package com.kaishengit.entitys;

import java.io.Serializable;

/**
 * @author 
 */
public class TicketState implements Serializable {
    private Integer id;

    public static final String default_state = "已入库";
    public static final String gived_state = "已下发";
    public static final String saled_state = "已销售";
    public static final String miss_state = "已挂失";
    public static final String overDate_state = "已过期";

    private String ticketNum;

    private String state;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTicketNum() {
        return ticketNum;
    }

    public void setTicketNum(String ticketNum) {
        this.ticketNum = ticketNum;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
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
        TicketState other = (TicketState) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTicketNum() == null ? other.getTicketNum() == null : this.getTicketNum().equals(other.getTicketNum()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTicketNum() == null) ? 0 : getTicketNum().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", ticketNum=").append(ticketNum);
        sb.append(", state=").append(state);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}