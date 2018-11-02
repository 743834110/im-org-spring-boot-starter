package xyz.berby.im.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.berby.im.entity.ServerConfig;


public interface ServerConfigDao extends JpaRepository<ServerConfig, String> {


}
