package com.kaishengit.entitys;

import java.io.Serializable;

/**
 * @author 
 */
public class SaleAccount implements Serializable {
    private Integer id;

    private String mobile;

    private String password;

    private Integer ticketofficeId;

    private String accountName;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getTicketofficeId() {
        return ticketofficeId;
    }

    public void setTicketofficeId(Integer ticketofficeId) {
        this.ticketofficeId = ticketofficeId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
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
        SaleAccount other = (SaleAccount) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getTicketofficeId() == null ? other.getTicketofficeId() == null : this.getTicketofficeId().equals(other.getTicketofficeId()))
            && (this.getAccountName() == null ? other.getAccountName() == null : this.getAccountName().equals(other.getAccountName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getTicketofficeId() == null) ? 0 : getTicketofficeId().hashCode());
        result = prime * result + ((getAccountName() == null) ? 0 : getAccountName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", mobile=").append(mobile);
        sb.append(", password=").append(password);
        sb.append(", ticketofficeId=").append(ticketofficeId);
        sb.append(", accountName=").append(accountName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}