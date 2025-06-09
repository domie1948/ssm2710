const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmkjm78/",
            name: "ssmkjm78",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmkjm78/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "线上点餐系统"
        } 
    }
}
export default base
