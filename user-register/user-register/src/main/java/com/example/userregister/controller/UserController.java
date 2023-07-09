package com.example.userregister.controller;

import com.example.userregister.mernis.CRFKPSPublicSoap;
import com.example.userregister.model.User;
import com.example.userregister.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {
    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping
    public ResponseEntity<String> register(@RequestBody User user) throws Exception {
        CRFKPSPublicSoap client = new CRFKPSPublicSoap();
        boolean isRealPerson = client.TCKimlikNoDogrula(Long.valueOf(user.getIdentityNumber()), user.getFirstName(), user.getLastName(), user.getBirthOfDateYear());
        if (isRealPerson) {
            userRepository.save(user);
            return ResponseEntity.ok("Kullanıcı Başarı ile kayıt edildi");
        }
        return ResponseEntity.badRequest().body("Yanlış kullanıcı bilgileri");
    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id){
        userRepository.deleteById(id);
    }
}
