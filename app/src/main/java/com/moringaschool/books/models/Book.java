
package com.moringaschool.books.models;

import android.text.TextUtils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.parceler.Parcel;

@Parcel


//public class Book {
//
//    @SerializedName("title_suggest")
//    @Expose
//    private String titleSuggest;
//    @SerializedName("edition_key")
//    @Expose
//    private List<String> editionKey = null;
//    @SerializedName("cover_i")
//    @Expose
//    private Integer coverI;
//    @SerializedName("isbn")
//    @Expose
//    private List<String> isbn = null;
//    @SerializedName("has_fulltext")
//    @Expose
//    private Boolean hasFulltext;
//    @SerializedName("text")
//    @Expose
//    private List<String> text = null;
//    @SerializedName("author_name")
//    @Expose
//    private List<String> authorName = null;
//    @SerializedName("seed")
//    @Expose
//    private List<String> seed = null;
//    @SerializedName("author_key")
//    @Expose
//    private List<String> authorKey = null;
//    @SerializedName("title")
//    @Expose
//    private String title;
//    @SerializedName("publish_date")
//    @Expose
//    private List<String> publishDate = null;
//    @SerializedName("type")
//    @Expose
//    private String type;
//    @SerializedName("ebook_count_i")
//    @Expose
//    private Integer ebookCountI;
//    @SerializedName("edition_count")
//    @Expose
//    private Integer editionCount;
//    @SerializedName("key")
//    @Expose
//    private String key;
//    @SerializedName("id_goodreads")
//    @Expose
//    private List<String> idGoodreads = null;
//    @SerializedName("publisher")
//    @Expose
//    private List<String> publisher = null;
//    @SerializedName("language")
//    @Expose
//    private List<String> language = null;
//    @SerializedName("last_modified_i")
//    @Expose
//    private Integer lastModifiedI;
//    @SerializedName("id_librarything")
//    @Expose
//    private List<String> idLibrarything = null;
//    @SerializedName("cover_edition_key")
//    @Expose
//    private String coverEditionKey;
//    @SerializedName("publish_year")
//    @Expose
//    private List<Integer> publishYear = null;
//    @SerializedName("first_publish_year")
//    @Expose
//    private Integer firstPublishYear;
//
//    /**
//     * No args constructor for use in serialization
//     *
//     */
//    public Book() {
//    }
//
//    /**
//     *
//     * @param ebookCountI
//     * @param idLibrarything
//     * @param seed
//     * @param isbn
//     * @param authorKey
//     * @param editionCount
//     * @param publishDate
//     * @param language
//     * @param title
//     * @param type
//     * @param idGoodreads
//     * @param hasFulltext
//     * @param coverEditionKey
//     * @param coverI
//     * @param publishYear
//     * @param authorName
//     * @param lastModifiedI
//     * @param firstPublishYear
//     * @param publisher
//     * @param text
//     * @param titleSuggest
//     * @param editionKey
//     * @param key
//     */
//    public Book(String titleSuggest, List<String> editionKey, Integer coverI, List<String> isbn, Boolean hasFulltext, List<String> text, List<String> authorName, List<String> seed, List<String> authorKey, String title, List<String> publishDate, String type, Integer ebookCountI, Integer editionCount, String key, List<String> idGoodreads, List<String> publisher, List<String> language, Integer lastModifiedI, List<String> idLibrarything, String coverEditionKey, List<Integer> publishYear, Integer firstPublishYear) {
//        super();
//        this.titleSuggest = titleSuggest;
//        this.editionKey = editionKey;
//        this.coverI = coverI;
//        this.isbn = isbn;
//        this.hasFulltext = hasFulltext;
//        this.text = text;
//        this.authorName = authorName;
//        this.seed = seed;
//        this.authorKey = authorKey;
//        this.title = title;
//        this.publishDate = publishDate;
//        this.type = type;
//        this.ebookCountI = ebookCountI;
//        this.editionCount = editionCount;
//        this.key = key;
//        this.idGoodreads = idGoodreads;
//        this.publisher = publisher;
//        this.language = language;
//        this.lastModifiedI = lastModifiedI;
//        this.idLibrarything = idLibrarything;
//        this.coverEditionKey = coverEditionKey;
//        this.publishYear = publishYear;
//        this.firstPublishYear = firstPublishYear;
//    }
//
//    public String getTitleSuggest() {
//        return titleSuggest;
//    }
//
//    public void setTitleSuggest(String titleSuggest) {
//        this.titleSuggest = titleSuggest;
//    }
//
//    public List<String> getEditionKey() {
//        return editionKey;
//    }
//
//    public void setEditionKey(List<String> editionKey) {
//        this.editionKey = editionKey;
//    }
//
//    public Integer getCoverI() {
//        return coverI;
//    }
//
//    public void setCoverI(Integer coverI) {
//        this.coverI = coverI;
//    }
//
//    public List<String> getIsbn() {
//        return isbn;
//    }
//
//    public void setIsbn(List<String> isbn) {
//        this.isbn = isbn;
//    }
//
//    public Boolean getHasFulltext() {
//        return hasFulltext;
//    }
//
//    public void setHasFulltext(Boolean hasFulltext) {
//        this.hasFulltext = hasFulltext;
//    }
//
//    public List<String> getText() {
//        return text;
//    }
//
//    public void setText(List<String> text) {
//        this.text = text;
//    }
//
//    public List<String> getAuthorName() {
//        return authorName;
//    }
//
//    public void setAuthorName(List<String> authorName) {
//        this.authorName = authorName;
//    }
//
//    public List<String> getSeed() {
//        return seed;
//    }
//
//    public void setSeed(List<String> seed) {
//        this.seed = seed;
//    }
//
//    public List<String> getAuthorKey() {
//        return authorKey;
//    }
//
//    public void setAuthorKey(List<String> authorKey) {
//        this.authorKey = authorKey;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public List<String> getPublishDate() {
//        return publishDate;
//    }
//
//    public void setPublishDate(List<String> publishDate) {
//        this.publishDate = publishDate;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    public Integer getEbookCountI() {
//        return ebookCountI;
//    }
//
//    public void setEbookCountI(Integer ebookCountI) {
//        this.ebookCountI = ebookCountI;
//    }
//
//    public Integer getEditionCount() {
//        return editionCount;
//    }
//
//    public void setEditionCount(Integer editionCount) {
//        this.editionCount = editionCount;
//    }
//
//    public String getKey() {
//        return key;
//    }
//
//    public void setKey(String key) {
//        this.key = key;
//    }
//
//    public List<String> getIdGoodreads() {
//        return idGoodreads;
//    }
//
//    public void setIdGoodreads(List<String> idGoodreads) {
//        this.idGoodreads = idGoodreads;
//    }
//
//    public List<String> getPublisher() {
//        return publisher;
//    }
//
//    public void setPublisher(List<String> publisher) {
//        this.publisher = publisher;
//    }
//
//    public List<String> getLanguage() {
//        return language;
//    }
//
//    public void setLanguage(List<String> language) {
//        this.language = language;
//    }
//
//    public Integer getLastModifiedI() {
//        return lastModifiedI;
//    }
//
//    public void setLastModifiedI(Integer lastModifiedI) {
//        this.lastModifiedI = lastModifiedI;
//    }
//
//    public List<String> getIdLibrarything() {
//        return idLibrarything;
//    }
//
//    public void setIdLibrarything(List<String> idLibrarything) {
//        this.idLibrarything = idLibrarything;
//    }
//
//    public String getCoverEditionKey() {
//        return coverEditionKey;
//    }
//
//    public void setCoverEditionKey(String coverEditionKey) {
//        this.coverEditionKey = coverEditionKey;
//    }
//
//    public List<Integer> getPublishYear() {
//        return publishYear;
//    }
//
//    public void setPublishYear(List<Integer> publishYear) {
//        this.publishYear = publishYear;
//    }
//
//    public Integer getFirstPublishYear() {
//        return firstPublishYear;
//    }
//
//    public void setFirstPublishYear(Integer firstPublishYear) {
//        this.firstPublishYear = firstPublishYear;
//    }
public class Book {
    private String openLibraryId;
    private String author;
    private String title;
    public String getOpenLibraryId() {
        return openLibraryId;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    // Get book cover from covers API
    public String getCoverUrl() {
        return "https://covers.openlibrary.org/b/olid/" + openLibraryId + "-L.jpg?default=false";
    }
    // Returns a Book given the expected JSON
    public static Book fromJson(JSONObject jsonObject) {
        Book book = new Book();
        try {
            // Deserialize json into object fields
            // Check if a cover edition is available
            if (jsonObject.has("cover_edition_key")) {
                book.openLibraryId = jsonObject.getString("cover_edition_key");
            } else if(jsonObject.has("edition_key")) {
                final JSONArray ids = jsonObject.getJSONArray("edition_key");
                book.openLibraryId = ids.getString(0);
            }
            book.title = jsonObject.has("title_suggest") ? jsonObject.getString("title_suggest") : "";
            book.author = getAuthor(jsonObject);
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
        // Return new object
        return book;
    }
    // Return comma separated author list when there is more than one author
    private static String getAuthor(final JSONObject jsonObject) {
        try {
            final JSONArray authors = jsonObject.getJSONArray("author_name");
            int numAuthors = authors.length();
            final String[] authorStrings = new String[numAuthors];
            for (int i = 0; i < numAuthors; ++i) {
                authorStrings[i] = authors.getString(i);
            }
            return TextUtils.join(", ", authorStrings);
        } catch (JSONException e) {
            return "";
        }
    }
    // Decodes array of book json results into business model objects
    public static ArrayList<Book> fromJson(JSONArray jsonArray) {
        ArrayList<Book> books = new ArrayList<>(jsonArray.length());
        // Process each result in json array, decode and convert to business
        // object
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject bookJson;
            try {
                bookJson = jsonArray.getJSONObject(i);
            } catch (Exception e) {
                e.printStackTrace();
                continue;
            }
            Book book = Book.fromJson(bookJson);
            if (book != null) {
                books.add(book);
            }
        }
        return books;
    }
}