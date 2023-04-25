package com.eatsTime.product.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.eatsTime.mybatis.config.MyBatisConfig;
import com.eatsTime.product.domain.ProductDTO;
import com.eatsTime.product.domain.ProductVO;

public class ProductDAO {
   public SqlSession sqlSession;

   public ProductDAO() {
      sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
   }
   
//   ��ǰ ��ü ��ȸ
   public List<ProductDTO> selectAll(HashMap<String, Object> pagable){
      return sqlSession.selectList("product.selectAll", pagable);
   }
   
   
   // ��ǰ ��ü ����
   
   public int getTotal(HashMap<String, Object> pagable) {
      return sqlSession.selectOne("product.getTotal", pagable);
   }
   
   // �����ǰ �Ѱ���
   public int getDeliveryTotal() {
      return sqlSession.selectOne("product.getDeliveryTotal");
   }
   
   //��� ��ǰ ����¡ ��ȸ
   public List<ProductDTO> selectDeliveryAll(HashMap<String, Object> pagable){
      return sqlSession.selectList("product.selectDeliveryAll", pagable);
   }
   
   // �Ⱦ���ǰ �Ѱ���
   public int getPickUpTotal() {
      return sqlSession.selectOne("product.getPickUpTotal");
   }
   
   //�Ⱦ� ��ǰ ����¡ ��ȸ
   public List<ProductDTO> selectPickUpAll(HashMap<String, Object> pagable){
      return sqlSession.selectList("product.selectPickUpAll", pagable);
   }
   
   // ��ǰ �󼼺���
   public ProductDTO selectProductDetail(String productId){
      return sqlSession.selectOne("product.selectProductDetail", productId);
   }
   
}