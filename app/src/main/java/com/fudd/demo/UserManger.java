package com.fudd.demo;

/**
 * 作者: 付殿东
 * 时间: 2019/7/10
 * 描述：
 */
public class UserManger {
    private ApiService apiService;
    private UserStore userStore;

    public UserManger() {
        apiService = new ApiService();
        userStore = new UserStore();
    }

    public void register() {
        apiService.regiter();
        userStore.regiter();
    }
}
