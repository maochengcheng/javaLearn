package com.chuancheng.corejava.design.principle.pattern.template.jdbc.dao;

import com.chuancheng.corejava.design.principle.pattern.template.jdbc.entity.Member;
import com.chuancheng.corejava.design.principle.pattern.template.jdbc.framework.JdbcTemplate;
import com.chuancheng.corejava.design.principle.pattern.template.jdbc.framework.RowMapper;

import javax.sql.DataSource;

import java.sql.ResultSet;
import java.util.List;

/**
 * @author: maochengcheng
 * @date: 2021/9/15
 * @function: 具体查询
 */
public class MemberDao extends JdbcTemplate {
    public MemberDao(DataSource dataSource) {
        super(dataSource);
    }

    public List<?> selectAll(){
        String sql = "select * from t_member";
        return super.executeQuery(sql,new RowMapper<Member>(){
            public Member mapRow(ResultSet rs, int rowNum) throws Exception{
                Member member = new Member();
                //字段多，原型模式
                member.setUsername(rs.getString("username"));
                member.setPassword(rs.getString("password"));
                member.setAge(rs.getInt("age"));
                member.setAddr(rs.getString("addr"));
                return member;
            }
        },null);
    }

}
