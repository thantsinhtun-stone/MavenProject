package con.stone.dao;

import con.stone.entity.Laptop;
import con.stone.repository.LaptopRepository;

import java.util.List;

public class LaptopDaoImpl extends AbstractDaoImpl<Laptop> implements LaptopRepository {
    public LaptopDaoImpl() {
        super();
    }

    @Override
    public Laptop save(Laptop entity) {
        return super.save(entity);
    }

    @Override
    public List<Laptop> findAll() {
        return super.findAll();
    }
}