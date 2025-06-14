package com.lpaxxa.superapp.infra;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtil {
    //CLASS NÀY CHỨA CÁC HÀM TĨNH ĐỂ TA MÓC VÀO CSDL
    //ENTITYMANAGERFACTORY
    //VÀ GIÚP TA TẠO RA CÁC ÔNG MANAGER CHUYÊN QUẢN LÝ CÁC @ENTITY
    // ĐC GỌI LÀ ENTITY_MANAGER
    //LƯU Ý: FACTORY KO NÊN GỌI NHIỀU LẦN VÌ MỖI LẦN GỌI NÓ, NÓ SẼ CHẠY LẠI CÁI FILE .XML -> OPTION TRONG FILE .XML KO TỐT, SẼ XÓA TABLE, ĐANG TRÔNG CODE ĐÃ LÀM ĐC DATA, CHẠY CÁC HÀM MÀ KHỞI ĐỘNG LẠI FACTORY LÀ TOANG TABLE
    //DO ĐÓ FACTORY CHỈ NÊN KHỞI ĐỘNG 1 LẦN DUY NHẤT !!!
    //TỨC LÀ CHỈ CÓ 1 OBJECT FACTORY TRONG RAM. CLASS MÀ CHỈ ĐẺ RA ĐC 1 OBJECT THÌ KĨ THUẬT NÀY ĐC GỌI LÀ SINGLETON
    //SINGLETON LÀ 1 TRONG 23 KĨ THUẬT NỔI TIẾNG LIÊN QUAN ĐẾN THIẾT KẾ CLASS/OBJECT - RÃNH HỌC CUỐN DESIGN PATTERNS (GoF)
    private static final String PERSISTENCE_UNIT_NAME = "com.lpaxxa.superapp-PU";
    //khai baó biến FACTORY
    private static EntityManagerFactory emf;

    //KHỐI LỆNH LỬNG LƠ
    //ĐOẠN CODE NÀY CHỈ CHẠY 1 LẦN DUY NHẤT,KHI CLASS NÀY ĐC NẠP VÀO RAM( CHẠM ĐẾN)
    //ANH CHÀNG EMF GIÚP KẾT NỐI VỚI CSDL, VÌ NÓ LÀ FACTORY, NÓ SẼ SINH RA CÁC ÔNG ENTITY_MANAGER ĐỂ CHUYÊN QUẢN LÍ CÁC @ENTITY, QUẢN LÍ ĐC @ENTITY TỨC LÀ QUẢN LÍ ĐC TABLE
    static {
        //khởi tạo FACTORY
        try {
            emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        } catch (Exception e) {
            System.out.println("Failed to init EntityManagerFactory: " + e.getMessage());
            throw new RuntimeException(e);

        }// đọc file xml bị lỗi, user/pass sai, db ko tồn tại, cố thể gây ra Exception

    }
    //HÀM TRẢ VỀ FACTORY NẾU CẦN DÙNG !!! HẦU HẾT TA KO CẦN DÙNG FACTORY, MÀ TA CẦN THẰNG NÀY ĐẺ RA ENTITY_MANAGER
    public static EntityManagerFactory getEntityManagerFactory() {
        return emf;
    }
    //hàm chính, chuyên tạo ra các manager quản lý các @Entity
    public static EntityManager getEnityManager(){
        return emf.createEntityManager();
    }
    //đóng nhà máy, ko kết nối csdl nữa
    public void shutdown() {
            emf.close();

    }

}
