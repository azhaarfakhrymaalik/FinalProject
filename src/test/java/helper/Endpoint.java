package helper;

public class Endpoint {

//    POSITIVE CASE

    public static final String host_gorest = "https://gorest.co.in/public/v2/";

    public static final String GET_LIST_USERS = host_gorest + "users";

    public static final String CREATE_NEW_USERS = host_gorest + "users";

    public static final String DELETE_USERS = host_gorest + "users";

//    NEGATIVE CASE
    public static final String GET_USER_INVALID_ID = "https://gorest.co.in/public/v2/users/999999";

    public static final String UPDATE_USER_INVALID_ID = "https://gorest.co.in/public/v2/users/invalid_id_999";
}

