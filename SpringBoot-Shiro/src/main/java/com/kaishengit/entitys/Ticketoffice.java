package com.kaishengit.entitys;

import java.io.Serializable;

/**
 * @author 
 */
public class Ticketoffice implements Serializable {
    private Integer id;

    public static final Integer default_ticket_num = 0;

    public SaleAccount getSaleAccount() {
        return saleAccount;
    }

    public void setSaleAccount(SaleAccount saleAccount) {
        this.saleAccount = saleAccount;
    }

    private SaleAccount saleAccount;

    private String name;

    private Integer saleAccountId;

    private String status;

    private Integer ticketNum;

    private String idCardKey;

    private String place;

    private String businessLicenceKey;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSaleAccountId() {
        return saleAccountId;
    }

    public void setSaleAccountId(Integer saleAccountId) {
        this.saleAccountId = saleAccountId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getTicketNum() {
        return ticketNum;
    }

    public void setTicketNum(Integer ticketNum) {
        this.ticketNum = ticketNum;
    }

    public String getIdCardKey() {
        return idCardKey;
    }

    public void setIdCardKey(String idCardKey) {
        this.idCardKey = idCardKey;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getBusinessLicenceKey() {
        return businessLicenceKey;
    }

    public void setBusinessLicenceKey(String businessLicenceKey) {
        this.businessLicenceKey = businessLicenceKey;
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
        Ticketoffice other = (Ticketoffice) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getSaleAccountId() == null ? other.getSaleAccountId() == null : this.getSaleAccountId().equals(other.getSaleAccountId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getTicketNum() == null ? other.getTicketNum() == null : this.getTicketNum().equals(other.getTicketNum()))
            && (this.getIdCardKey() == null ? other.getIdCardKey() == null : this.getIdCardKey().equals(other.getIdCardKey()))
            && (this.getPlace() == null ? other.getPlace() == null : this.getPlace().equals(other.getPlace()))
            && (this.getBusinessLicenceKey() == null ? other.getBusinessLicenceKey() == null : this.getBusinessLicenceKey().equals(other.getBusinessLicenceKey()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getSaleAccountId() == null) ? 0 : getSaleAccountId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getTicketNum() == null) ? 0 : getTicketNum().hashCode());
        result = prime * result + ((getIdCardKey() == null) ? 0 : getIdCardKey().hashCode());
        result = prime * result + ((getPlace() == null) ? 0 : getPlace().hashCode());
        result = prime * result + ((getBusinessLicenceKey() == null) ? 0 : getBusinessLicenceKey().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", saleAccountId=").append(saleAccountId);
        sb.append(", status=").append(status);
        sb.append(", ticketNum=").append(ticketNum);
        sb.append(", idCardKey=").append(idCardKey);
        sb.append(", place=").append(place);
        sb.append(", businessLicenceKey=").append(businessLicenceKey);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}