package org.example.repositories;

import org.example.entitites._BaseEntity;

import java.util.ArrayList;
import java.util.List;

    public class _BaseRepositoryImpl<T extends _BaseEntity> implements _BaseRepository<T> {
    protected List<T> entitites = new ArrayList<>();

    @Override
    public void create(T obj) {
        entitites.add(obj);
    }

    @Override
    public List<T> read() {
        return entitites;
    }

    @Override
    public void update(T obj) {
        var index = entitites.stream().filter(entity -> entity.getId() == obj.getId()).findFirst();
        if(index.isPresent()){
            var entidadeAntiga = index.get();
            entidadeAntiga = obj;
        }
    }

    @Override
    public void delete(int id) {
        entitites.removeIf(entity -> entity.getId() == id);
    }

    public T findById(int id){
        return entitites.stream().filter(entity -> entity.getId() == id).findFirst().orElse(null);
    }
}
