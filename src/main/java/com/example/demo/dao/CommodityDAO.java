package com.example.demo.dao;

import com.example.demo.entity.Commodity;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


import java.util.List;

@Mapper
public interface CommodityDAO {
    @Insert(value = "INSERT INTO Commodity VALUE(#{commodity.cid),#(commodity.name),#(commodity.price),#(commodity.quantity),#(commodity.discount)")
    int insert(Commodity commodity);

    @Select(value = "SELECT * FROM Commodity")
    List<Commodity> getAllCommodity();

    @Select(value = "SELECT cid FROM Commodity WHERE Commodity.cid = #{cid}")
    Commodity findCommodity();

    @Update(value = "UPDATE Commodity SET Commodity.price =  #{price} WHERE Commodity.cid = #{cid}")
    boolean updatePrice(Integer cid,double price);

    @Update(value = "UPDATE Commodity SET Commodity.discount =  #{discount} WHERE Commodity.cid = #{cid}")
    boolean updateDiscount(Integer cid,double discount);

    @Update(value = "UPDATE Commodity SET Commodity.quantity =  #{quantity} WHERE Commodity.cid = #{cid}")
    boolean updateQuantity(Integer cid,int quantity);

    @Delete(value = "DELETE FROM Commodity WHERE mid = #{cid}")
    int deleteCommodity(Integer cid);
}
