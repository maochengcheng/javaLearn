package com.chuancheng.corejava.design.principle.pattern.template.jdbc.framework;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: maochengcheng
 * @date: 2021/9/15
 * @function: 抽象类，jdbc
 */
public abstract class JdbcTemplate {
    private DataSource dataSource;

    public JdbcTemplate(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public final List<?> executeQuery(String sql, RowMapper<?> rowMapper, Object[] values){
        try {
            //1.获取连接
            Connection conn = this.getConnection();
            //2.创建语句集
            PreparedStatement pstm = this.createPreParedStatement(conn,sql);
            //3.执行语句集
            ResultSet rs = this.executetQuery(pstm,values);
            //4.处理结果集
            List<?> result = this.parseResultSet(rs,rowMapper);
            //5.关闭结果集
            rs.close();
            //6.关闭语句集
            pstm.close();
            //7.关闭连接
            conn.close();
            return result;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    private List<?> parseResultSet(ResultSet rs, RowMapper<?> rowMapper) throws Exception {
        List<Object> result = new ArrayList<>();
        int rowNum = 1;
        while(rs.next()){
            result.add(rowMapper.mapRow(rs,rowNum++));
        }
        return  null;
    }

    private ResultSet executetQuery(PreparedStatement pstm, Object[] values) throws SQLException {
        for (int i = 0; i < values.length; i++) {
            pstm.setObject(i,values[i]);
        }
        return pstm.executeQuery();
    }

    private PreparedStatement createPreParedStatement(Connection conn, String sql) throws SQLException {
        return conn.prepareStatement(sql);
    }

    private Connection getConnection() throws Exception {
        return this.dataSource.getConnection();
    }
}
