package xyz.berby.im.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import xyz.berby.im.dao.ServerConfigDao;
import xyz.berby.im.entity.ServerConfig;
import xyz.berby.im.service.ServerConfigService;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ServerConfigServiceImpl implements ServerConfigService<ServerConfig, String> {

    @Autowired
    private ServerConfigDao serverConfigDao;

    @Override
    public List<ServerConfig> findAll() {
        return this.serverConfigDao.findAll();
    }

    @Override
    public List<ServerConfig> findAll(Sort sort) {
        return this.serverConfigDao.findAll(sort);
    }

    @Override
    public List<ServerConfig> findAllById(Iterable<String> strings) {
        return this.serverConfigDao.findAllById(strings);
    }

    @Override
    public <S extends ServerConfig> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public void flush() {
        this.serverConfigDao.flush();
    }

    @Override
    public <S extends ServerConfig> S saveAndFlush(S entity) {
        return this.saveAndFlush(entity);
    }

    @Override
    public void deleteInBatch(Iterable<ServerConfig> entities) {
        this.serverConfigDao.deleteInBatch(entities);
    }

    @Override
    public void deleteAllInBatch() {
        this.serverConfigDao.deleteAllInBatch();
    }

    @Override
    public ServerConfig getOne(String s) {
        return this.serverConfigDao.getOne(s);
    }

    @Override
    public <S extends ServerConfig> List<S> findAll(Example<S> example) {
        return this.serverConfigDao.findAll(example);
    }

    @Override
    public <S extends ServerConfig> List<S> findAll(Example<S> example, Sort sort) {
        return this.serverConfigDao.findAll(example, sort);
    }
}
