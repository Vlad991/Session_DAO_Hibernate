package com.infopulse;

import com.infopulse.dao.DAO;
import com.infopulse.dao.EngineDAO;
import com.infopulse.model.Engine;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {
        SessionFactory factory = null;

        try {

            factory = new Configuration().configure().buildSessionFactory();
            DAO<Engine, String> engineDAO = new EngineDAO(factory);

            final Engine engine = new Engine();
            engine.setModel("engine_model_01");
            engine.setPower(12345);

            engineDAO.create(engine);


        } finally {
            if (factory != null) {
                factory.close();
            }
        }
    }


}
