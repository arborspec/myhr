package hr.entity;

import java.util.List;

public class SysRole {
    private Integer roleId;

    private String roleName;

    private String roleDesc;

    private String roleFlag;
    
    //当个角色有多个用户
    private List<Users> users;
    
    //当个角色有多项权限
    
    private List<SysRight> rights;
    
    public List<Users> getUsers() {
		return users;
	}

	public void setUsers(List<Users> users) {
		this.users = users;
	}

	public List<SysRight> getRights() {
		return rights;
	}

	public void setRights(List<SysRight> rights) {
		this.rights = rights;
	}

	public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc == null ? null : roleDesc.trim();
    }

    public String getRoleFlag() {
        return roleFlag;
    }

    public void setRoleFlag(String roleFlag) {
        this.roleFlag = roleFlag == null ? null : roleFlag.trim();
    }
}