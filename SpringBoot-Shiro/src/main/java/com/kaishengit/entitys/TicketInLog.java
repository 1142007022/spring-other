package com.kaishengit.entitys;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class TicketInLog implements Serializable {
    private Integer id;

    public static final String default_state = "未入库";
    public static final String gived_state = "已下发";
    private Date createTime;

    private String startNum;

    private String endNum;

    private Integer totalNum;

    private String inAccountName;

    private String state;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getStartNum() {
        return startNum;
    }

    public void setStartNum(String startNum) {
        this.startNum = startNum;
    }

    public String getEndNum() {
        return endNum;
    }

    public void setEndNum(String endNum) {
        this.endNum = endNum;
    }

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public String getInAccountName() {
        return inAccountName;
    }

    public void setInAccountName(String inAccountName) {
        this.inAccountName = inAccountName;
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
        TicketInLog other = (TicketInLog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getStartNum() == null ? other.getStartNum() == null : this.getStartNum().equals(other.getStartNum()))
            && (this.getEndNum() == null ? other.getEndNum() == null : this.getEndNum().equals(other.getEndNum()))
            && (this.getTotalNum() == null ? other.getTotalNum() == null : this.getTotalNum().equals(other.getTotalNum()))
            && (this.getInAccountName() == null ? other.getInAccountName() == null : this.getInAccountName().equals(other.getInAccountName()))
            && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getStartNum() == null) ? 0 : getStartNum().hashCode());
        result = prime * result + ((getEndNum() == null) ? 0 : getEndNum().hashCode());
        result = prime * result + ((getTotalNum() == null) ? 0 : getTotalNum().hashCode());
        result = prime * result + ((getInAccountName() == null) ? 0 : getInAccountName().hashCode());
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
        sb.append(", createTime=").append(createTime);
        sb.append(", startNum=").append(startNum);
        sb.append(", endNum=").append(endNum);
        sb.append(", totalNum=").append(totalNum);
        sb.append(", inAccountName=").append(inAccountName);
        sb.append(", state=").append(state);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}