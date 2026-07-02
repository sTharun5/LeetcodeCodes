# Write your MySQL query statement below
-- count(*) as attended_exams
-- count(*) as attended_exams
select st.student_id ,st.student_name ,s.subject_name,count(e.student_id) as attended_exams
from Students as st
cross join Subjects as s
left join Examinations as e
on e.student_id = st.student_id and e.subject_name = s.subject_name
group by e.student_id ,st.student_name ,s.subject_name
order by st.student_id,s.subject_name;



-- e.student_id ,st.student_name ,s.subject_name 