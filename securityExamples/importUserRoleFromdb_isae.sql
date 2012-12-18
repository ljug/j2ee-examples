insert dbuser.users (user_name, user_pass) select username, sha(password) from db_isae.Users;
insert dbuser.user_roles (user_name, role_name) select username, fonction from db_isae.Users;
insert dbuser.user_roles (user_name, role_name) select U.username, D.typedroit from db_isae.Users U, db_isae.DroitAcces D where D.UserId = U.UserId; 

