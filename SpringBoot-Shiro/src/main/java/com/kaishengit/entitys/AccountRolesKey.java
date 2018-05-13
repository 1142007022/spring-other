package com.kaishengit.entitys;

import java.io.Serializable;

/**
 * @author 
 */
public class AccountRolesKey implements Serializable {
    private Integer accountId;

    private Integer rolesId;

    private static final long serialVersionUID = 1L;

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getRolesId() {
        return rolesId;
    }

    public void setRolesId(Integer rolesId) {
        this.rolesId = rolesId;
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
        AccountRolesKey other = (AccountRolesKey) that;
        return (this.getAccountId() == null ? other.getAccountId() == null : this.getAccountId().equals(other.getAccountId()))
            && (this.getRolesId() == null ? other.getRolesId() == null : this.getRolesId().equals(other.getRolesId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        result = prime * result + ((getRolesId() == null) ? 0 : getRolesId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", accountId=").append(accountId);
        sb.append(", rolesId=").append(rolesId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}