/* 1. Select the titles of all the songs on the album "Forbidden". */
SELECT title FROM songs
INNER JOIN albums ON songs.album = albums._id
WHERE albums.name = "Forbidden";

/* 2. Repeat the previous query but this time display the songs in track order.
      You may want to include the track number in the output to verify that it worked ok. */
SELECT track, title FROM songs
INNER JOIN albums ON songs.album = albums._id
WHERE albums.name = "Forbidden"
ORDER BY songs.track;

/* 3. Display all songs for the band "Deep Purple". */
SELECT title FROM songs
INNER JOIN albums ON songs.album = albums._id
INNER JOIN artists ON albums.artist = artists._id
WHERE artists.name = "Deep Purple";

/* 4. Rename the band "Mehitabel" to "One Kitten".
   Note that this is an exception to the advice to always fully qualify your column names.
   SET artists.name won't work, you just need to specify name. */
UPDATE artists
SET name = "One Kitten"
WHERE artists.name = "Mehitabel";

/* 5. Check that the record was correctly renamed. */
SELECT name FROM artists
WHERE artists.name = "One Kitten";

/* 6. Select the titles of all the songs by Aerosmith in alphabetical order.
      Include only the title in the output. */
SELECT title FROM songs
INNER JOIN albums ON songs.album = albums._id
INNER JOIN artists ON albums.artist = artists._id
WHERE artists.name = "Aerosmith"
ORDER BY title;

/* 7. Replace the column that you used in the previous answer with count(title) to get just a count of the number of songs. */
SELECT count(title) FROM songs
INNER JOIN albums ON songs.album = albums._id
INNER JOIN artists ON albums.artist = artists._id
WHERE artists.name = "Aerosmith"
ORDER BY title;

/* 8. Search the internet to find out how to get a list of the songs from step 6 without any duplicates. */
SELECT DISTINCT title FROM songs
INNER JOIN albums ON songs.album = albums._id
INNER JOIN artists ON albums.artist = artists._id
WHERE artists.name = "Aerosmith"
ORDER BY title;

/* 9. Search the internet again to find out how to get a count of the songs without duplicates.
   Hint: It uses the same keyword as step 8 but the syntax may not be obvious. */
SELECT count(DISTINCT title) FROM songs
INNER JOIN albums ON songs.album = albums._id
INNER JOIN artists ON albums.artist = artists._id
WHERE artists.name = "Aerosmith"
ORDER BY title;

/* 10. Repeat the previous query to find the number of artists (which, obviously, should be one) and the number of albums. */
SELECT count(DISTINCT artist), count(DISTINCT albums.name) FROM songs
INNER JOIN albums ON songs.album = albums._id
INNER JOIN artists ON albums.artist = artists._id
WHERE artists.name = "Aerosmith"
ORDER BY title;
