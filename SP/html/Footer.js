function createFooter() {
    const footer = document.createElement("footer");
    footer.style.backgroundColor = "darkslategray";
    footer.style.textAlign = "center";
    footer.style.bottom = "0";
    footer.style.width = "100%";
    footer.style.position = "fixed";
    footer.style.color = "white";

    const paragraph = document.createElement("p");
    paragraph.textContent = "In case of problems contact the author: Matej Dzubak";
    const br = document.createElement("br");
    const contactInfo1 = document.createElement("p");
    contactInfo1.textContent = "+421 949 275 272";
    const contactInfo2 = document.createElement("p");
    contactInfo2.textContent = "mat.dzubak@gmail.com";
    paragraph.appendChild(br);
    paragraph.appendChild(contactInfo1);
    paragraph.appendChild(br);
    paragraph.appendChild(contactInfo2);
    footer.appendChild(paragraph);
    return footer;
}

document.body.appendChild(createFooter());