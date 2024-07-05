const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootqi5ww/",
            name: "springbootqi5ww",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootqi5ww/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "公司日常考勤系统"
        } 
    }
}
export default base
