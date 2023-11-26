function Navbar() {
    return (
        <>
        <nav class="navbar navbar-expand-lg bg-primary navbar-light">
        <div class="container-fluid">
            <a class="navbar-brand" href="homepage.html">
                <img src="/img/logos/nyr_logo_0_2.png" alt="alt logo rangers"></img>
            </a>
            <span class="navbar-text" style="font-style: italic; font-size: 100%">New York Rangers</span>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#collapsibleNavbar">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="collapsibleNavbar">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link" href="about.html">About</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="games.html">Games</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="players_page.html">Players</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="team_page.html">Team</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="forum.html">Forum</a>
                    </li>
                </ul>
                <a class="btn btn-secondary" href="login.html">Log in</a>
            </div>
        </div>
        </nav>
        </>
    );
}

export default Navbar;