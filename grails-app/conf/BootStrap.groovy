import com.gwayiit.SecRole
import com.gwayiit.User
import com.gwayiit.SecUserSecRole

class BootStrap {

    def init = { servletContext ->
        createAdministrators()
    }
    def destroy = {
    }

    private void createAdministrators() {
        log.error 'Administrators creation begin... '
        def adminRole = SecRole.findByAuthority('ROLE_ADMIN')?: new SecRole(authority:'ROLE_ADMIN').save()

        def admin1 = new User(username:'THM068', password:'zinzilee4321', enabled: true, name: 'Thando', surname: 'Mafela'  )
        def admin2 = new User(username:'MKM068', password:'gwabalanda4321',enabled:true, name: 'Mkhululi', surname: 'Moyo')

        if(admin1.save()) {
            if(SecUserSecRole.findBySecUserAndSecRole(admin1,adminRole)) {
                SecUserSecRole.create(admin1,adminRole)
            }
        }
        if(admin2.save()) {
            if(SecUserSecRole.findBySecUserAndSecRole(admin2,adminRole)) {
                SecUserSecRole.create(admin2,adminRole)
            }
        }
        log.error 'Administrators creation ends... '
    }
}
