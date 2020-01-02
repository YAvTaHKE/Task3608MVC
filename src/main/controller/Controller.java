package main.controller;

import main.model.Model;
import main.view.EditUserView;
import main.view.UsersView;

public class Controller {

    private Model model;
    private UsersView usersView;
    private EditUserView editUserView;

    public void setEditUserView(EditUserView editUserView) {
        this.editUserView = editUserView;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public void onShowAllUsers(){
        model.loadUsers();
        this.usersView.refresh(model.getModelData());
    }


    public void setUsersView(UsersView usersView) {
        this.usersView = usersView;
    }

    public void onShowAllDeletedUsers(){
        model.loadDeletedUsers();
        this.usersView.refresh(model.getModelData());
    }

    public void onOpenUserEditForm(long userId) {
        model.loadUserById(userId);
        this.editUserView.refresh(model.getModelData());
    }

    public void onUserDelete(long id) {
        model.deleteUserById(id);
        this.usersView.refresh(model.getModelData());
    }

    public void onUserChange(String name, long id, int level) {
        model.changeUserData(name, id, level);
        this.editUserView.refresh(model.getModelData());
        this.usersView.refresh(model.getModelData());
    }
}
