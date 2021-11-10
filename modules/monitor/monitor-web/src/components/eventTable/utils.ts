export const formatDate = (date: Date) =>
  `${dashedDate(date)} ${date.toLocaleTimeString([], {
    hour: "2-digit",
    minute: "2-digit",
  })}`;

const dashedDate = (date: Date) =>
  date
    .toLocaleDateString([], {
      day: "2-digit",
      month: "2-digit",
      year: "numeric",
    })
    .replace(/\//g, "-");
