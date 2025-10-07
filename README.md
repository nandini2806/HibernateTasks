what is ORM
- what are the core interfaces of hibernate technology / key components of hibernate 
- what are the advantages of using ORM over JDBC
- Explain hibernate architecture
- what is purpose of the hibernate configuration file(hibernate.cfg.xml)
- what is Configuration
- features of hibernate :
ans => automatic persistent, ORM ,Transaction management, lazy loading, automatic schema generation criteria API,(HQL), mapping concepts.
- How to Insert the data in hibernate => save()/persist()     return type : void
- How to Update the data in hibernate => update()/merge()     return type : void 
- How to delete the data in hibernate => delete()/remove()    return type : void

	**First level cache	Second level cache
**
1.Basic 
First level cache is a session level cache and it is always associated with session level object
Second level cache is session factory level cache and it is available across all sessions

2.Enabled 
It is enabled by default.
It is not enabled by default.

3.Availability 
It is available for a session 
It is available across all session.

4.Configuration 
No Extra configuration required 
We have to decide  which concurrency strategy to use and also need to configure cache expiration and physical cache attributes.
