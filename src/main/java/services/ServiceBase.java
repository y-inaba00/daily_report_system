package services;
/**
 * DB接続に関わる共通処理を行うクラス
 */

import jakarta.persistence.EntityManager;

import utils.DBUtil;

public class ServiceBase {
    
    /**
     * EntityManagerインスタンス
     */
    protected EntityManager em = DBUtil.createEntityManager();
    
    /**
     * EntityManagerのクローズ
     */
    public void close() {
        if(em.isOpen()) {
            em.close();
        }
    }
    
}
