package mb;

import dao.UserDao;
import entities.User;
import java.sql.SQLException;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.naming.NamingException;

/**
 * A minimal Managed Bean for CRUD 2 attributes
 * one for current User
 * one for the list of users
 * @author pfares
 */
@ManagedBean
@SessionScoped
public class UserControl {
    private User selectedUser;
    private List<User> lusers;
    /**
     * Creates a new instance of UserControl
     */
    public UserControl() {
        selectedUser=new User();
    }

    /**
     * @return the selectedUser
     */
    public User getSelectedUser() {
        return selectedUser;
    }

    /**
     * @param selectedUser the selectedUser to set
     */
    public void setSelectedUser(User selectedUser) {
        this.selectedUser = selectedUser;
    }

    /**
     * @return the lusers
     */
    public List<User> getLusers() throws NamingException, SQLException {
        lusers=UserDao.getAllUsers();
        return lusers;
    }

    /**
     * @param lusers the lusers to set
     */
    public void setLusers(List<User> lusers) {
        this.lusers = lusers;
    }
    
    public String create() throws SQLException, NamingException {
        UserDao.addUser(selectedUser);
        
        return "index";
        
    }
}
