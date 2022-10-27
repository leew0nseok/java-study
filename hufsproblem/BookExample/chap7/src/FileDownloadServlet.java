public class FileDownloadServlet extends HttpServlet{
    FileDownloadServlet(){}

    @Override
    public void service() {
        System.out.println("파일 다운로드 합니다.");
    }
}
