public class MainFrontController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // URI ��û ��ο� ��Ʈ�ѷ� ����
    private Map<String, MainController> controllers = new HashMap<>();

    public MainFrontController() {
        // ���� ������
        controllers.put("/", new MainController() {
            public String execute(HttpServletRequest request, HttpServletResponse response) {
                // ...
            }
        });

        // ��� ������
        controllers.put("/banner", new BannerController());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // ��û URI ��� ����
        String uri = request.getRequestURI();
        String contextPath = request.getContextPath();
        String path = uri.substring(contextPath.length());

        // ���ε� ��Ʈ�ѷ� ����
        MainController controller = controllers.get(path);
        String view = controller.execute(request, response);

        // JSP ������ ���
        RequestDispatcher dispatcher = request.getRequestDispatcher(view);
        dispatcher.forward(request, response);
    }
}