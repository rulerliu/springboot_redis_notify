package org.example.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

@Data
@TableName("host_info")
public class HostInfo extends Model<HostInfo> {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    private String type;
    private String ip;
    @TableField("`usage`")
    private String usage;
}
