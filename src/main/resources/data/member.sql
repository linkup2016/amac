
CREATE TABLE IF NOT EXISTS Members (
   Member_Id INT AUTO_INCREMENT PRIMARY KEY,
   Name VARCHAR(255)
);
-- CREATE PROCEDURE GenerateMemberID()
-- BEGIN
--   DECLARE newID INT;
-- SELECT IFNULL(MAX(ID), 9999) + 1 INTO newID FROM Members;
-- IF newID > 100000 THEN
--     SIGNAL SQLSTATE '45000'
--     SET MESSAGE_TEXT = 'No more IDs available in the specified range.';
-- ELSE
--     INSERT INTO Members (ID) VALUES (newID);
-- SELECT newID AS GeneratedID;
-- END IF;
-- END//


