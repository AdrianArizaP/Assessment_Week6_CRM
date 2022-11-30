package repositories;

import com.example.AssesmentCRM.models.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    //all crud databse methods

    /*
    @Query("SELECT x FROM user WHERE x.email = 'adrian.ariza@solera.com'")
    public boolean existByEmail(String email);
    */


}
