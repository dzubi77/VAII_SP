function Navbar() {
    const navbar = document.createElement("nav");
    navbar.className = "navbar navbar-expand-lg bg-primary navbar-light";

    const container = document.createElement("div");
    container.className = "container-fluid";

    const brandLink = document.createElement("a");
    brandLink.className = "navbar-brand";
    brandLink.href = "homepage.html";

    const logoImg = document.createElement("img");
    logoImg.src = "/img/logos/nyr_logo_0_2.png";
    logoImg.alt = "alt logo rangers";
    brandLink.appendChild(logoImg);

    const brandText = document.createElement("span");
    brandText.textContent = "New York Rangers";
    brandText.style.fontStyle = "italic";
    brandText.style.fontSize = "100%";

    const toggleButton = document.createElement("button");
    toggleButton.className = "navbar-toggler";
    toggleButton.type = "button";
    toggleButton.setAttribute("data-bs-toggle", "collapse");
    toggleButton.setAttribute("data-bs-target", "#collapsibleNavbar");

    const toggleIcon = document.createElement("span");
    toggleIcon.className = "navbar-toggler-icon";
    toggleButton.appendChild(toggleIcon);

    const navbarCollapse = document.createElement("div");
    navbarCollapse.className = "collapse navbar-collapse";
    navbarCollapse.id = "collapsibleNavbar";

    function addNavItemToList(list, linkText, linkUrl) {
        const listItem = document.createElement("li");
        listItem.className = "nav-item";
        const link = document.createElement("a");
        link.className = "nav-link";
        link.href = linkUrl;
        link.textContent = linkText;
        listItem.appendChild(link);
        list.appendChild(listItem);
    }

    const logButton = document.createElement("a");
    logButton.className = "btn btn-secondary";
    logButton.href = "login.html";
    logButton.textContent = "Log in";

    const navbar_nav = document.createElement("ul");
    navbar_nav.className = "navbar-nav";

    addNavItemToList(navbar_nav, "About", "about.html");
    addNavItemToList(navbar_nav, "Games", "games.html");
    addNavItemToList(navbar_nav, "Players", "players.html");
    addNavItemToList(navbar_nav, "Team", "team_page.html");
    addNavItemToList(navbar_nav, "Forum", "forum.html");

    container.appendChild(brandLink);
    container.appendChild(brandText);
    container.appendChild(toggleButton);
    container.appendChild(navbarCollapse);
    navbar.appendChild(container);
    navbarCollapse.appendChild(navbar_nav);
    navbarCollapse.appendChild(logButton);

    return navbar;
}

document.body.appendChild(Navbar());