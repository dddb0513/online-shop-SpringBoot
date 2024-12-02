package scut.javawebonlineshop.controller;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import scut.javawebonlineshop.pojo.Email;
import scut.javawebonlineshop.service.imp.EmailServiceImp;
@Slf4j
@CrossOrigin
@RestController
public class EmailController {
    @Autowired
    private EmailServiceImp emailService;

    @PostMapping("/send-verification-code")
    public String sendVerificationCode(@RequestBody Email email) {
        emailService.sendVerificationCode(email.getEmail());
        return "验证码已发送";
    }

    @PostMapping("/verify-code")
    public String verifyCode(@RequestBody Email request) {
        boolean isValid = emailService.verifyCode(request.getEmail(), request.getCode());
        if (isValid) {
            emailService.cleanupCode(request.getEmail()); // 验证成功后删除验证码
            return "验证码正确";
        } else {
            return "验证码错误或已过期";
        }
    }
    @PostMapping("/send-confirmation-email")
    public String sendConfirmationEmail(@RequestBody Email email) {
        emailService.sendConfirmationEmail(email.getEmail());
        return "确认邮件已发送";
    }
}


