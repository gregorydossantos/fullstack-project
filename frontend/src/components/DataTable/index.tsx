import axios from 'axios';
import Pagination from 'components/Pagination';
import { useEffect, useState } from 'react';
import { SchedulePage } from 'types/schedule';
import { BASE_URL } from 'useful/request';

const DataTable = () => {

    const [activePage, setActivePage] = useState(0);

    const [page, setPage] = useEffect<SchedulePage>({

    });

    useEffect(() => {
        axios.get(`${BASE_URL}/`)
    })
}