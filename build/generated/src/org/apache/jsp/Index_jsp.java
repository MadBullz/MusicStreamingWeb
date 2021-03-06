package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/album.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/base.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/header.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/mediaqueries.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/hero.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/footer.css\">\n");
      out.write("    <title>Document</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <header>\n");
      out.write("        <div class=\"header-container\">\n");
      out.write("            <div class=\"header-logo\">\n");
      out.write("                <a class=\"nav-link text-dark\" asp-area=\"\" asp-page=\"/Index\"><img src=\"https://about.gitlab.com/images/press/logo/png/gitlab-icon-1-color-black-rgb.png\" style=\"color:white\" /></a>\n");
      out.write("            </div>\n");
      out.write("            <nav class=\"nav-mobile\">\n");
      out.write("                <!-- Profile -->\n");
      out.write("                <div class=\"profile\">\n");
      out.write("                    <svg viewBox=\"0 0 1024 1024\" class=\"profile-icon\">\n");
      out.write("                        <path d=\"M730.06 679.64q-45.377 53.444-101.84 83.443t-120 29.999q-64.032 0-120.75-30.503t-102.6-84.451q-40.335 13.109-77.645 29.747t-53.948 26.722l-17.142 10.084Q106.388 763.84 84.96 802.41t-21.428 73.107 25.461 59.242 60.754 24.705h716.95q35.293 0 60.754-24.705t25.461-59.242-21.428-72.603-51.679-57.225q-6.554-4.033-18.907-10.84t-51.427-24.453-79.409-30.755zm-221.84 25.72q-34.285 0-67.561-14.873t-60.754-40.335-51.175-60.502-40.083-75.124-25.461-84.451-9.075-87.728q0-64.032 19.915-116.22t54.452-85.964 80.67-51.931 99.072-18.151 99.072 18.151 80.67 51.931 54.452 85.964 19.915 116.22q0 65.04-20.167 130.58t-53.948 116.72-81.426 83.443-98.568 32.268z\"></path>\n");
      out.write("                    </svg>\n");
      out.write("                </div>\n");
      out.write("                <!-- Hamburger menu -->\n");
      out.write("                <input type=\"checkbox\" class=\"toggler\" />\n");
      out.write("                <div class=\"hamburger-menu\"><div></div></div>\n");
      out.write("                <div class=\"menu\">\n");
      out.write("                    <div class=\"background-overlay\"></div>\n");
      out.write("                    <div class=\"menu-overlay\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li class=\"search\">\n");
      out.write("                                <input placeholder=\"Search for Artis,song or playlist\" type=\"text\" />\n");
      out.write("                                <i class=\"fas fa-search\"></i>\n");
      out.write("                                <i class=\"fas fa-times\"></i>\n");
      out.write("                            </li>\n");
      out.write("                            <li><a href=\"#\">Premium</a></li>\n");
      out.write("                            <li><a href=\"#\">Help</a></li>\n");
      out.write("                            <li><a href=\"#\">Download</a></li>\n");
      out.write("                            <li role=\"separator\"></li>\n");
      out.write("                            <li><a href=\"#\">Account</a></li>\n");
      out.write("                            <li><a href=\"#\">Log out</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                        <div class=\"menu-overlay-logo\">\n");
      out.write("                            <img src=\"https://storage.googleapis.com/pr-newsroom-wp/1/2018/11/Spotify_Logo_CMYK_Green.png\" style=\"color:white\" />\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("            <!-- This is the menu that will be shown on Desktop -->\n");
      out.write("            <nav class=\"nav-desktop\">\n");
      out.write("                <!-- Site menu -->\n");
      out.write("                <ul>\n");
      out.write("                    <li class=\"search\">\n");
      out.write("                        <input placeholder=\"Search for Artis,song or playlist\" type=\"text\" />\n");
      out.write("                        <i class=\"fas fa-search\"></i>\n");
      out.write("                    </li>\n");
      out.write("                    <li><a href=\"#\">Premium</a></li>\n");
      out.write("                    <li><a href=\"#\">Help</a></li>\n");
      out.write("                    <li><a class=\"nav-link text-dark\" asp-area=\"\" asp-page=\"/Privacy\">Privacy</a></li>\n");
      out.write("                    <li role=\"separator\"></li>\n");
      out.write("                </ul>\n");
      out.write("                <!-- Profile menu -->\n");
      out.write("                <div class=\"profile-container\">\n");
      out.write("                    <input type=\"checkbox\" class=\"dropdown-menu-toggler\" />\n");
      out.write("                    <div class=\"dropdown-menu\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\">Account</a></li>\n");
      out.write("                            <li><a href=\"#\">Log out</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"profile\">\n");
      out.write("                        <svg viewBox=\"0 0 1024 1024\" class=\"profile-icon\">\n");
      out.write("                            <path d=\"M730.06 679.64q-45.377 53.444-101.84 83.443t-120 29.999q-64.032 0-120.75-30.503t-102.6-84.451q-40.335 13.109-77.645 29.747t-53.948 26.722l-17.142 10.084Q106.388 763.84 84.96 802.41t-21.428 73.107 25.461 59.242 60.754 24.705h716.95q35.293 0 60.754-24.705t25.461-59.242-21.428-72.603-51.679-57.225q-6.554-4.033-18.907-10.84t-51.427-24.453-79.409-30.755zm-221.84 25.72q-34.285 0-67.561-14.873t-60.754-40.335-51.175-60.502-40.083-75.124-25.461-84.451-9.075-87.728q0-64.032 19.915-116.22t54.452-85.964 80.67-51.931 99.072-18.151 99.072 18.151 80.67 51.931 54.452 85.964 19.915 116.22q0 65.04-20.167 130.58t-53.948 116.72-81.426 83.443-98.568 32.268z\"></path>\n");
      out.write("                        </svg>\n");
      out.write("                    </div>\n");
      out.write("                    <ul>\n");
      out.write("                        <li>Profile</li>\n");
      out.write("                        <li>\n");
      out.write("                            <svg viewBox=\"0 0 1024 1024\" class=\"profile-arrow\">\n");
      out.write("                                <path d=\"M476.455 806.696L95.291 425.532Q80.67 410.911 80.67 390.239t14.621-34.789 35.293-14.117 34.789 14.117L508.219 698.8l349.4-349.4q14.621-14.117 35.293-14.117t34.789 14.117 14.117 34.789-14.117 34.789L546.537 800.142q-19.159 19.159-38.318 19.159t-31.764-12.605z\"></path>\n");
      out.write("                            </svg>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </div>\n");
      out.write("        </header>\n");
      out.write("        <section class=\"hero\">\n");
      out.write("            <div class=\"hero-container\">\n");
      out.write("                <div class=\"hero-content\">\n");
      out.write("                    <h1 class=\"hero-title\">Go Premium. Be happy.</h1>\n");
      out.write("                    <button class=\"hero-button\" href=\"/Login\">GET SPOTIFY PREMIUM</button>\n");
      out.write("                    <div class=\"terms\">\n");
      out.write("                        <span>*</span>\n");
      out.write("                        <a href=\"#\" class=\"hero-terms-link\">Terms and conditions</a><span>apply.</span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- ALBUMS -->\n");
      out.write("        <section class=\"albums\">\n");
      out.write("            <div class=\"albums-container\">\n");
      out.write("                <div class=\"albums-content\">\n");
      out.write("                    <h2>Looking for music?</h2>\n");
      out.write("                    <p>Start listening to the best new releases.</p>\n");
      out.write("                    <button>JOIN WITH US</button>\n");
      out.write("                    <!-- @*<iframe src=\"https://open.spotify.com/embed/album/1DFixLWuPkv3KT3TnV35m3\" width=\"300\" height=\"380\" frameborder=\"0\" allowtransparency=\"true\" allow=\"encrypted-media\"></iframe>*@ -->\n");
      out.write("                </div>\n");
      out.write("                <div class=\"albums-cards-container\">\n");
      out.write("                    <!-- Travis Scott -->\n");
      out.write("                    <div class=\"album\">\n");
      out.write("                        <img src=\"https://i.scdn.co/image/ab67706f0000000236f70792450e32a6af85dbf6\" />\n");
      out.write("                        <div class=\"album-info\">\n");
      out.write("                            <h2>FRANCHISE (feat. Young Thug & M.I.A.)</h2>\n");
      out.write("                            <h4>Travis Scott</h4>\n");
      out.write("                            <a href=\"#\">PLAY NOW</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- ZAYN -->\n");
      out.write("                    <div class=\"album\">\n");
      out.write("                        <img src=\"https://pbs.twimg.com/media/EsSnah7W4AM8nWX.jpg\" />\n");
      out.write("                        <div class=\"album-info\">\n");
      out.write("                            <h2>Better</h2>\n");
      out.write("                            <h4>ZAYN</h4>\n");
      out.write("                            <a href=\"#\">PLAY NOW</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Joji -->\n");
      out.write("                    <div class=\"album\">\n");
      out.write("                        <img src=\"https://i.pinimg.com/736x/3d/44/b1/3d44b17d4872e11e6447aa381fec1a8f.jpg\" />\n");
      out.write("                        <div class=\"album-info\">\n");
      out.write("                            <h2>Justin Bieber</h2>\n");
      out.write("                            <h4>Joji</h4>\n");
      out.write("                            <a href=\"#\">PLAY NOW</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Jennifer Lopez -->\n");
      out.write("                    <div class=\"album\">\n");
      out.write("                        <img src=\"https://image.thanhnien.vn/1024/uploaded/hoalp/2021_07_30/billie-eilish-happier-than-ever_vfyn.jpeg\" />\n");
      out.write("                        <div class=\"album-info\">\n");
      out.write("                            <h2>Happier Than Ever</h2>\n");
      out.write("                            <h4>Billie Eilish</h4>\n");
      out.write("                            <a href=\"#\">PLAY NOW</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Machine Gun Kelly -->\n");
      out.write("                    <div class=\"album\">\n");
      out.write("                        <img src=\"https://i-english.vnecdn.net/2020/05/15/playlist-thoai-mai-gac-chan-le-7831-7045-1589528794_m_460x0.jpg\" />\n");
      out.write("                        <div class=\"album-info\">\n");
      out.write("                            <h2>Vu Cat Tuong</h2>\n");
      out.write("                            <h4>Album Playlist</h4>\n");
      out.write("                            <a href=\"#\">PLAY NOW</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Cold -->\n");
      out.write("                    <div class=\"album\">\n");
      out.write("                        <img src=\"https://i.scdn.co/image/ab67616d0000b273c1b0465012a1c380e3b5d988\" />\n");
      out.write("                        <div class=\"album-info\">\n");
      out.write("                            <h2>Year Collection</h2>\n");
      out.write("                            <h4>Best Song US-UK</h4>\n");
      out.write("                            <a href=\"#\">PLAY NOW</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("        </section>\n");
      out.write("        <footer>\n");
      out.write("            <nav class=\"footer-nav\">\n");
      out.write("                <div class=\"logo-footer\">\n");
      out.write("                    <a href=\"#\"><img src=\"https://about.gitlab.com/images/press/logo/png/gitlab-icon-1-color-black-rgb.png\" /></a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"top-links\">\n");
      out.write("                    <div class=\"company-links\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li>COMPANY</li>\n");
      out.write("                            <li><a href=\"#\">About</a></li>\n");
      out.write("                            <li><a href=\"#\">Jobs</a></li>\n");
      out.write("                            <li><a href=\"#\">For the Record</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"communities-links\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li>COMMUNITIES</li>\n");
      out.write("                            <li><a href=\"#\">For artists</a></li>\n");
      out.write("                            <li><a href=\"#\">Developers</a></li>\n");
      out.write("                            <li><a href=\"#\">Advertising</a></li>\n");
      out.write("                            <li><a href=\"#\">Investors</a></li>\n");
      out.write("                            <li><a href=\"#\">Vendors</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"useful-links\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li>USEFUL LINKS</li>\n");
      out.write("                            <li><a href=\"#\">Help</a></li>\n");
      out.write("                            <li><a href=\"#\">Web Player</a></li>\n");
      out.write("                            <li><a href=\"#\">Free Mobile App</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"social-icons\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\"><i class=\"fab fa-facebook fa-5x\"></i></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\"><i class=\"fab fa-twitter fa-5x\"></i></a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"#\"><i class=\"fab fa-instagram fa-5x\"></i></a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"country\">\n");
      out.write("                    <a href=\"#\"><span>USA</span><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"43\" height=\"32\" viewBox=\"0 0 43 32\"><path d=\"M0 0h60.8v2.462H0V0zM0 4.923h60.8v2.462H0V4.923zM0 9.846h60.8v2.462H0V9.846zM0 14.77h60.8v2.46H0v-2.46zM0 19.692h60.8v2.462H0v-2.462zM0 24.616h60.8v2.462H0v-2.462zM0 29.54h60.8V32H0v-2.46z\" fill=\"#BD3D44\" /><path d=\"M0 2.462h60.8v2.462H0V2.462zM0 7.385h60.8v2.462H0V7.385zM0 12.308h60.8v2.462H0v-2.462zM0 17.23h60.8v2.463H0V17.23zM0 22.154h60.8v2.462H0v-2.462zM0 27.077h60.8v2.462H0v-2.463z\" fill=\"#FFF\" /><path d=\"M0 0h24.32v17.23H0V0z\" fill=\"#192F5D\" /><path d=\"M2.027.737l.22.68h.717l-.58.422.222.68-.58-.42-.578.42.22-.68-.578-.422h.716zM6.08.737l.22.68h.717l-.58.422.222.68-.58-.42-.58.42.222-.68-.58-.422h.717zM10.133.737l.22.68h.717l-.58.422.222.68-.58-.42-.578.42.22-.68-.578-.422h.716zM14.187.737l.22.68h.717l-.58.422.222.68-.58-.42-.578.42.22-.68-.578-.422h.716zM18.24.737l.22.68h.717l-.58.422.222.68-.58-.42-.58.42.222-.68-.58-.422h.717zM22.294.737l.22.68h.717l-.578.422.22.68-.578-.42-.58.42.222-.68-.58-.422h.717zM4.053 2.46l.22.682h.717l-.58.42.222.682-.58-.42-.578.42.22-.68-.578-.422h.716zM8.107 2.46l.22.682h.717l-.58.42.222.682-.58-.42-.578.42.22-.68-.578-.422h.716zM12.16 2.46l.22.682h.717l-.58.42.222.682-.58-.42-.58.42.222-.68-.58-.422h.717zM16.214 2.46l.22.682h.717l-.578.42.22.682-.578-.42-.58.42.222-.68-.58-.422h.717zM20.267 2.46l.22.682h.717l-.58.42.222.682-.58-.42-.578.42.22-.68-.578-.422h.716zM2.027 4.184l.22.68h.717l-.58.422.222.68-.58-.42-.578.42.22-.68-.578-.42h.716zM6.08 4.184l.22.68h.717l-.58.422.222.68-.58-.42-.58.42.222-.68-.58-.42h.717zM10.133 4.184l.22.68h.717l-.58.422.222.68-.58-.42-.578.42.22-.68-.578-.42h.716zM14.187 4.184l.22.68h.717l-.58.422.222.68-.58-.42-.578.42.22-.68-.578-.42h.716zM18.24 4.184l.22.68h.717l-.58.422.222.68-.58-.42-.58.42.222-.68-.58-.42h.717zM22.294 4.184l.22.68h.717l-.578.422.22.68-.578-.42-.58.42.222-.68-.58-.42h.717zM4.053 5.907l.22.68h.717l-.58.422.222.68-.58-.42-.578.42.22-.68-.578-.422h.716zM8.107 5.907l.22.68h.717l-.58.422.222.68-.58-.42-.578.42.22-.68-.578-.422h.716zM12.16 5.907l.22.68h.717l-.58.422.222.68-.58-.42-.58.42.222-.68-.58-.422h.717zM16.214 5.907l.22.68h.717l-.578.422.22.68-.578-.42-.58.42.222-.68-.58-.422h.717zM20.267 5.907l.22.68h.717l-.58.422.222.68-.58-.42-.578.42.22-.68-.578-.422h.716zM2.027 7.63l.22.68h.717l-.58.422.222.68-.58-.42-.578.42.22-.68-.578-.42h.716zM6.08 7.63l.22.68h.717l-.58.422.222.68-.58-.42-.58.42.222-.68-.58-.42h.717zM10.133 7.63l.22.68h.717l-.58.422.222.68-.58-.42-.578.42.22-.68-.578-.42h.716zM14.187 7.63l.22.68h.717l-.58.422.222.68-.58-.42-.578.42.22-.68-.578-.42h.716zM18.24 7.63l.22.68h.717l-.58.422.222.68-.58-.42-.58.42.222-.68-.58-.42h.717zM22.294 7.63l.22.68h.717l-.578.422.22.68-.578-.42-.58.42.222-.68-.58-.42h.717zM4.053 9.353l.22.68h.717l-.58.422.222.68-.58-.42-.578.42.22-.68-.578-.42h.716zM8.107 9.353l.22.68h.717l-.58.422.222.68-.58-.42-.578.42.22-.68-.578-.42h.716zM12.16 9.353l.22.68h.717l-.58.422.222.68-.58-.42-.58.42.222-.68-.58-.42h.717zM16.214 9.353l.22.68h.717l-.578.422.22.68-.578-.42-.58.42.222-.68-.58-.42h.717zM20.267 9.353l.22.68h.717l-.58.422.222.68-.58-.42-.578.42.22-.68-.578-.42h.716zM2.027 11.076l.22.68h.717l-.58.422.222.68-.58-.42-.578.42.22-.68-.578-.42h.716zM6.08 11.076l.22.68h.717l-.58.422.222.68-.58-.42-.58.42.222-.68-.58-.42h.717zM10.133 11.076l.22.68h.717l-.58.422.222.68-.58-.42-.578.42.22-.68-.578-.42h.716zM14.187 11.076l.22.68h.717l-.58.422.222.68-.58-.42-.578.42.22-.68-.578-.42h.716zM18.24 11.076l.22.68h.717l-.58.422.222.68-.58-.42-.58.42.222-.68-.58-.42h.717zM22.294 11.076l.22.68h.717l-.578.422.22.68-.578-.42-.58.42.222-.68-.58-.42h.717zM4.053 12.8l.22.68h.717l-.58.42.222.682-.58-.42-.578.42.22-.68-.578-.422h.716zM8.107 12.8l.22.68h.717l-.58.42.222.682-.58-.42-.578.42.22-.68-.578-.422h.716zM12.16 12.8l.22.68h.717l-.58.42.222.682-.58-.42-.58.42.222-.68-.58-.422h.717zM16.214 12.8l.22.68h.717l-.578.42.22.682-.578-.42-.58.42.222-.68-.58-.422h.717zM20.267 12.8l.22.68h.717l-.58.42.222.682-.58-.42-.578.42.22-.68-.578-.422h.716zM2.027 14.522l.22.68h.717l-.58.422.222.68-.58-.42-.578.42.22-.68-.578-.42h.716zM6.08 14.522l.22.68h.717l-.58.422.222.68-.58-.42-.58.42.222-.68-.58-.42h.717zM10.133 14.522l.22.68h.717l-.58.422.222.68-.58-.42-.578.42.22-.68-.578-.42h.716zM14.187 14.522l.22.68h.717l-.58.422.222.68-.58-.42-.578.42.22-.68-.578-.42h.716zM18.24 14.522l.22.68h.717l-.58.422.222.68-.58-.42-.58.42.222-.68-.58-.42h.717zM22.294 14.522l.22.68h.717l-.578.422.22.68-.578-.42-.58.42.222-.68-.58-.42h.717z\" fill=\"#FFF\" /></svg></a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"bottom-links\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"#\">Legal</a></li>\n");
      out.write("                        <li><a href=\"#\">Privacy Center</a></li>\n");
      out.write("                        <li><a href=\"#\">Privacy Policy</a></li>\n");
      out.write("                        <li><a href=\"#\">Cookies</a></li>\n");
      out.write("                        <li><a href=\"#\">About Ads</a></li>\n");
      out.write("                        <li><a href=\"#\">Additional CA Privacy Disclosures</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <span>&copy; 2020 Spotify AB</span>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </footer>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
