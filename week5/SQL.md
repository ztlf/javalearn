aggregate function

| **Name**                                                     | **Description**                                  |
| ------------------------------------------------------------ | ------------------------------------------------ |
| [AVG()](https://dev.mysql.com/doc/refman/8.0/en/group-by-functions.html#function_avg) | Return the average value of the argument         |
| [BIT_AND()](https://dev.mysql.com/doc/refman/8.0/en/group-by-functions.html#function_bit-and) | Return bitwise AND                               |
| [BIT_OR()](https://dev.mysql.com/doc/refman/8.0/en/group-by-functions.html#function_bit-or) | Return bitwise OR                                |
| [BIT_XOR()](https://dev.mysql.com/doc/refman/8.0/en/group-by-functions.html#function_bit-xor) | Return bitwise XOR                               |
| [COUNT()](https://dev.mysql.com/doc/refman/8.0/en/group-by-functions.html#function_count) | Return a count of the number of rows returned    |
| [COUNT(DISTINCT)](https://dev.mysql.com/doc/refman/8.0/en/group-by-functions.html#function_count-distinct) | Return the count of a number of different values |
| [GROUP_CONCAT()](https://dev.mysql.com/doc/refman/8.0/en/group-by-functions.html#function_group-concat) | Return a concatenated string                     |
| [JSON_ARRAYAGG()](https://dev.mysql.com/doc/refman/8.0/en/group-by-functions.html#function_json-arrayagg) | Return result set as a single JSON array         |
| [JSON_OBJECTAGG()](https://dev.mysql.com/doc/refman/8.0/en/group-by-functions.html#function_json-objectagg) | Return result set as a single JSON object        |
| [MAX()](https://dev.mysql.com/doc/refman/8.0/en/group-by-functions.html#function_max) | Return the maximum value                         |
| [MIN()](https://dev.mysql.com/doc/refman/8.0/en/group-by-functions.html#function_min) | Return the minimum value                         |
| [STD()](https://dev.mysql.com/doc/refman/8.0/en/group-by-functions.html#function_std) | Return the population standard deviation         |
| [STDDEV()](https://dev.mysql.com/doc/refman/8.0/en/group-by-functions.html#function_stddev) | Return the population standard deviation         |
| [STDDEV_POP()](https://dev.mysql.com/doc/refman/8.0/en/group-by-functions.html#function_stddev-pop) | Return the population standard deviation         |
| [STDDEV_SAMP()](https://dev.mysql.com/doc/refman/8.0/en/group-by-functions.html#function_stddev-samp) | Return the sample standard deviation             |
| [SUM()](https://dev.mysql.com/doc/refman/8.0/en/group-by-functions.html#function_sum) | Return the sum                                   |
| [VAR_POP()](https://dev.mysql.com/doc/refman/8.0/en/group-by-functions.html#function_var-pop) | Return the population standard variance          |
| [VAR_SAMP()](https://dev.mysql.com/doc/refman/8.0/en/group-by-functions.html#function_var-samp) | Return the sample variance                       |
| [VARIANCE()](https://dev.mysql.com/doc/refman/8.0/en/group-by-functions.html#function_variance) | Return the population standard variance          |

view:

A view is a virtual table based on the result-set of an SQL statement.

left join

The LEFT JOIN keyword returns all records from the left table (table1), and the matched records from the right table (table2). The result is NULL from the right side, if there is no match.

truncate

TRUNCATE TABLE removes all rows from a table, but the table structure and its columns, constraints, indexes, and so on remain. 

procedure:

A stored procedure is a prepared SQL code that you can save, so the code can be reused over and over again.

pagination:

Use OFFSET/FETCH  and LIMIT for pagination.

statement (sql injection) VS prepare statement (multiple) vs callable statement (procedure)trigger:

| [**Statement**](https://facingissuesonit.com/2019/05/01/jdbc-statement-interface) | **[Prepared Statement](https://facingissuesonit.com/2019/05/01/jdbc-preparedstatement-interface)** | **Callable Statement**                                       |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| It is used to execute normal SQL queries.                    | It is used to execute dynamic or parameterized SQL queries.  | It is used to execute [Stored procedure](https://facingissuesonit.com/2019/05/06/jdbc-stored-procedure-example) or [function](https://facingissuesonit.com/2019/05/06/jdbc-function-execution-example). |
| It is proffered when particular query to be executed only once. | It is proffered when particular query to be executed multiple times. | It is proffered when [stored procedure](https://facingissuesonit.com/2019/05/06/jdbc-stored-procedure-example) or [functions ](https://facingissuesonit.com/2019/05/06/jdbc-function-execution-example)to be executed. |
| You can no pass parameter to query by using this interface.  | You can pass parameter to query at run time by using this interface. | You can pass three types of parameters by using this interface IN, OUT and IN OUT |
| This interface mainly used for DDL statements like CREATE, ALTER , DROP etc. | This is used to be any kind of SQL queries which are used multiple times | It is used with [Stored Procedure](https://facingissuesonit.com/2019/05/06/jdbc-stored-procedure-example) and [functions](https://facingissuesonit.com/2019/05/06/jdbc-function-execution-example). |
| The performance of this interface is very low.               | The performance of this interface is better than query while using with multiple queries. | Performance of this interface is very high because [stored procedure](https://facingissuesonit.com/2019/05/06/jdbc-stored-procedure-example) execute on database end. |
|                                                              |                                                              |                                                              |