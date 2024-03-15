package dev.naimsulejmani.locationservicegr2.services.impls;

import dev.naimsulejmani.locationservicegr2.entities.User;
import dev.naimsulejmani.locationservicegr2.infrastructure.data.DbDao;
import dev.naimsulejmani.locationservicegr2.infrastructure.services.impls.BaseServiceImpl;
import dev.naimsulejmani.locationservicegr2.repositories.UserRepository;
import dev.naimsulejmani.locationservicegr2.services.UserService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class UserServiceImpl extends BaseServiceImpl<User, Long> implements UserService {
    private final DbDao dbDao;

    protected UserServiceImpl(UserRepository repository, DbDao dbDao) {
        super(repository);
        this.dbDao = dbDao;
    }

    @Override
    public List<User> findByCountLocationGreaterThan(int count) {
        String procedureName = "sp_get_user_by_count_location";
        HashMap<String, Object> inParams = new HashMap<>();
        inParams.put("count", count);
        return dbDao.getResultFromProcedure(procedureName, inParams, null, User.class);
    }
}










