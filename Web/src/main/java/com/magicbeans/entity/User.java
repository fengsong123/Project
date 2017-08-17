package com.magicbeans.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldIgnore;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author magic-beans
 * @since 2017-07-28
 */
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

	protected String id;

	@TableField(ignore = FieldIgnore.INSERT)
	protected Date createtime;

	@TableField(ignore = FieldIgnore.INSERT_UPDATE)
	protected Date updatetime;


	private String name;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public Date getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "User{" +
			"id=" + id +
			", name=" + name +
			", createtime=" + createtime +
			", updatetime=" + updatetime +
			"}";
	}
}
