let index = {
    init: function () {
        $("#btn-save").on("click", () => { //function(){} 대신 ()=>{} 사용하는 이유?? this를 바인딩하기 위해서!
            this.save();
        });

        $("#btn-login").on("click", () => { //function(){} 대신 ()=>{} 사용하는 이유?? this를 바인딩하기 위해서!
            this.login();
        });
    },

    save: function () {
        // alert('user의 save함수 호출됨');
        let data = {
            //User model과 변수 같게 설정
            user_id: $("#user_id").val(),
            user_pw: $("#user_pw").val(),
            email: $("#email").val(),
        };

        // console.log(data);

        // ajax 호출시 default가 비동기 호출
        // ajax 통신을 이용해서 3개의 데이터를 json으로 변경하여 insert 요청!!
        $.ajax({
            type: "POST",
            url: "/api/user",
            data: JSON.stringify(data),
            contentType: "application/json; charset=utf-8", // body 데이터가 어떤 타입인지(MIME)
            dataType: "json" // 요청을 서버로 해서 응답이 왔을 때 기본적으로 모든 것이 문자열 if 생긴게 json이라면 => javascript 오브젝트로 변경
        }).done(function (resp) {
            alert("회원가입이 완료되었습니다.")
            console.log(resp)
            location.href = "/";
        }).fail(function (error) {
            alert(JSON.stringify(error));
        }); //ajax 통신을 이용해서 3개의 데이터를 json으로 변경하여 insert 요청!!
    },

    login: function () {
        // alert('user의 save함수 호출됨');
        let data = {
            //User model과 변수 같게 설정
            user_id: $("#user_id").val(),
            user_pw: $("#user_pw").val(),
        };

        $.ajax({
            type: "POST",
            url: "/api/user/login",
            data: JSON.stringify(data),
            contentType: "application/json; charset=utf-8", // body 데이터가 어떤 타입인지(MIME)
            dataType: "json" // 요청을 서버로 해서 응답이 왔을 때 기본적으로 모든 것이 문자열 if 생긴게 json이라면 => javascript 오브젝트로 변경
        }).done(function (resp) {
            alert("로그인이 완료되었습니다.")
            location.href = "/";
        }).fail(function (error) {
            alert(JSON.stringify(error));
        }); //ajax 통신을 이용해서 3개의 데이터를 json으로 변경하여 insert 요청!!

    }
}

index.init();