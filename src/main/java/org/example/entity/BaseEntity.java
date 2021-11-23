package org.example.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.util.Date;

class BaseEntity extends Model<BaseEntity> {
    @TableId(value = "id", type = IdType.AUTO)
    protected Long id;

    protected Integer createId;

    protected Date createTime;

    protected Integer updateId;

    protected Date udpateTime;

}