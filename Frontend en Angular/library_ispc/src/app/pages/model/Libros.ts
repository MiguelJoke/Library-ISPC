export class Libro {
  id: number;
  title: string;
  autor: string;
  category: string;
  lang: string;

  constructor(
    id: number,
    title: string,
    autor: string,
    category: string,
    lang: string
  ) {
    this.id = id;
    this.title = title;
    this.autor = autor;
    this.category = category;
    this.lang = lang;
  }
}
